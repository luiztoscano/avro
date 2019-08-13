package com.accenture.converter;

import com.accenture.avro.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;

import java.io.IOException;

public class UserConverter implements Converter<com.accenture.dto.User, User> {
    @Override
    public User convert(com.accenture.dto.User user) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            byte[] node = mapper.writeValueAsBytes(user);
            User avro = mapper.readValue(node, User.class);

            return avro;

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
