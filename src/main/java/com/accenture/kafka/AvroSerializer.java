package com.accenture.kafka;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvroSerializer<T extends SpecificRecordBase> implements Serializer<T> {
	private static final byte MAGIC_BYTE = 0x0;
	private static final Integer ID_SIZE = 4;
	private static final Logger logger = LoggerFactory.getLogger(AvroSerializer.class);

	public AvroSerializer() {
	}

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
	}

	@Override
	public byte[] serialize(String topic, T data) {
		try {
			byte[] result = null;

			if (data != null) {
				logger.info("data='{}'", data);

				ByteArrayOutputStream out = new ByteArrayOutputStream();
				BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(out, null);
				Integer id = Registry.getIdBySchema(data.getSchema());
				out.write(MAGIC_BYTE);
				out.write(ByteBuffer.allocate(ID_SIZE).putInt(id).array());

				DatumWriter<GenericRecord> datumWriter = new SpecificDatumWriter<>(data.getSchema());
				datumWriter.write(data, binaryEncoder);

				binaryEncoder.flush();
				out.close();

				result = out.toByteArray();
				logger.info("serialized data='{}'", DatatypeConverter.printHexBinary(result));
			}
			return result;
		} catch (IOException ex) {
			throw new SerializationException("Can't serialize data='" + data + "' for topic='" + topic + "'", ex);
		}
	}

	@Override
	public void close() {
	}

}
