package com.accenture;

import com.accenture.avro.BoletoNaoSimulado;
import com.accenture.avro.Employee;
import com.accenture.avro.User;
import com.accenture.converter.BoletoNaoSimuladoConverter;
import com.accenture.converter.EmployeeConverter;
import com.accenture.converter.UserConverter;
import com.accenture.kafka.BoletoNaoSimuladoProducer;
import com.accenture.kafka.EmployeeProducer;
import com.accenture.kafka.UserProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Autowired
    private UserProducer userProducer;
    @Autowired
    private EmployeeProducer employeeProducer;
    @Autowired
    private BoletoNaoSimuladoProducer boletoNaoSimuladoProducer;

    @PostMapping(path="/send/user")
    public void sendUser(@RequestBody com.accenture.dto.User user) {
        UserConverter converter = new UserConverter();
        User avro = converter.convert(user);

        userProducer.send(avro);
    }

    @PostMapping(path = "/send/employee")
    public void sendEmployee(@RequestBody com.accenture.dto.Employee employee) {
        EmployeeConverter converter = new EmployeeConverter();
        Employee avro = converter.convert(employee);

        employeeProducer.send(avro);
    }

    @PostMapping(path = "/send/boleto")
    public void sendBoletoNaoSimulado(@RequestBody com.accenture.dto.BoletoNaoSimulado boletoNaoSimulado) {
        BoletoNaoSimuladoConverter converter = new BoletoNaoSimuladoConverter();
        BoletoNaoSimulado avro = converter.convert(boletoNaoSimulado);

        boletoNaoSimuladoProducer.send(avro);
    }
}
