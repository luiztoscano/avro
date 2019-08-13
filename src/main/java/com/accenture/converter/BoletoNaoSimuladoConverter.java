package com.accenture.converter;

import com.accenture.avro.BoletoNaoSimulado;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;

import java.io.IOException;

public class BoletoNaoSimuladoConverter implements Converter<com.accenture.dto.BoletoNaoSimulado, BoletoNaoSimulado> {
    @Override
    public BoletoNaoSimulado convert(com.accenture.dto.BoletoNaoSimulado boletoNaoSimulado) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            byte[] node = mapper.writeValueAsBytes(boletoNaoSimulado);
            BoletoNaoSimulado avro = mapper.readValue(node, BoletoNaoSimulado.class);

            return avro;

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
