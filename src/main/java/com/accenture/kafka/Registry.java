package com.accenture.kafka;

import com.accenture.avro.BoletoNaoSimulado;
import com.accenture.avro.Employee;
import com.accenture.avro.User;
import org.apache.avro.Schema;

public class Registry {
    public static Schema getSchemaById(Integer id) {
        switch (id) {
            case 0: return User.getClassSchema();
            case 1: return Employee.getClassSchema();
            case 2: return BoletoNaoSimulado.getClassSchema();
            default: throw new RuntimeException("Schema not found (id = " + id + ")");
        }
    }

    public static Integer getIdBySchema(Schema schema) {
        if (User.getClassSchema().equals(schema)) {
            return 0;
        }

        if (Employee.getClassSchema().equals(schema)) {
            return 1;
        }

        if (BoletoNaoSimulado.getClassSchema().equals(schema)) {
            return 2;
        }

        throw new RuntimeException("Schema not found (schema = " + schema + ")");
    }
}
