package com.accenture.kafka;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.ExtendedDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.DatatypeConverter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

public class ExtendedAvroDeserializer implements ExtendedDeserializer<GenericRecord> {
    private static final Logger logger = LoggerFactory.getLogger(ExtendedAvroDeserializer.class);

    @Override
    public GenericRecord deserialize(String topic, Headers headers, byte[] data) {
        try {
            GenericRecord result = null;

            if (data != null) {
                logger.info("data='{}'", DatatypeConverter.printHexBinary(data));
                String typeName = new String(headers.lastHeader("type").value());
                Class<?> type = Class.forName(typeName);
                Schema schema = ((GenericRecord) type.newInstance()).getSchema();


                DatumReader<GenericRecord> datumReader = new SpecificDatumReader<>(schema);
                Decoder decoder = DecoderFactory.get().binaryDecoder(data, null);

                result = (GenericRecord) datumReader.read(null, decoder);

                logger.info("deserialized data='{}'", result);
            }
            return result;
        } catch (Exception ex) {
            throw new SerializationException(
                    "Can't deserialize data '" + Arrays.toString(data) + "' from topic '" + topic + "'", ex);
        }

    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public GenericRecord deserialize(String topic, byte[] data) {
        return null;
    }

    @Override
    public void close() {

    }
}
