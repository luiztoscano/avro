package com.accenture.kafka;

import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.header.Headers;
import org.apache.kafka.common.serialization.ExtendedSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.DatatypeConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public class ExtendedAvroSerializer implements ExtendedSerializer<GenericRecord> {
    private static final Logger logger = LoggerFactory.getLogger(ExtendedAvroSerializer.class);

    @Override
    public byte[] serialize(String topic, Headers headers, GenericRecord data) {
        try {
            byte[] result = null;

            logger.info("data='{}'", data);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(out, null);

            DatumWriter<GenericRecord> datumWriter = new SpecificDatumWriter<>(data.getSchema());
            datumWriter.write(data, binaryEncoder);
            headers.add("type", data.getClass().getName().getBytes());
            binaryEncoder.flush();
            out.close();

            result = out.toByteArray();

            logger.info("serialized data='{}'", DatatypeConverter.printHexBinary(result));

            return result;

        } catch (IOException ex) {
            throw new SerializationException("Can't serialize data='" + data + "' for topic='" + topic + "'", ex);
        }
    }

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public byte[] serialize(String topic, GenericRecord data) {
        return new byte[0];
    }

    @Override
    public void close() {

    }
}
