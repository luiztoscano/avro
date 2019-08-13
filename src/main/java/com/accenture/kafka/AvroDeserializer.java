package com.accenture.kafka;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.apache.avro.Schema;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvroDeserializer<T extends SpecificRecordBase> implements Deserializer<T> {
	private static final byte MAGIC_BYTE = 0x0;
	private static final Integer ID_SIZE = 4;
	private static final Logger logger = LoggerFactory.getLogger(AvroDeserializer.class);

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
	}

	private ByteBuffer getByteBuffer(byte[] payload) {
		ByteBuffer buffer = ByteBuffer.wrap(payload);
		if (buffer.get() != MAGIC_BYTE) {
			throw new SerializationException("Unknown magic byte!");
		}
		return buffer;
	}

	@Override
	public T deserialize(String topic, byte[] data) {
		try {
			T result = null;

			if (data != null) {
				logger.info("data='{}'", DatatypeConverter.printHexBinary(data));

				ByteBuffer buffer = getByteBuffer(data);
				int id = buffer.getInt();
				int length = buffer.limit() - 1 - ID_SIZE;
				int start = buffer.position() + buffer.arrayOffset();

				Schema schema = Registry.getSchemaById(id);

				Decoder decoder = DecoderFactory.get().binaryDecoder(buffer.array(), start, length, null);
				DatumReader reader = new SpecificDatumReader(schema);
				Object obj = reader.read(null, decoder);

				result = (T) obj;

				logger.info("deserialized data='{}'", result);
			}
			return result;
		} catch (Exception ex) {
			throw new SerializationException(
					"Can't deserialize data '" + Arrays.toString(data) + "' from topic '" + topic + "'", ex);
		}
	}

	@Override
	public void close() {
	}

}
