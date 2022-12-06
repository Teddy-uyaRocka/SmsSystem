package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/sms")
public class Controller {

    private final Service service;
@Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping
//Use method as POST request:
    public void sendSms(@RequestBody SmsRequest smsRequest) {
        service.sendSms(smsRequest);
    }
}
