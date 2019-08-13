package com.accenture.converter;

import com.accenture.avro.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;

import java.io.IOException;

public class EmployeeConverter implements Converter<com.accenture.dto.Employee, Employee> {

    @Override
    public Employee convert(com.accenture.dto.Employee employee) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            byte[] node = mapper.writeValueAsBytes(employee);
            Employee avro = mapper.readValue(node, Employee.class);

            return avro;

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
