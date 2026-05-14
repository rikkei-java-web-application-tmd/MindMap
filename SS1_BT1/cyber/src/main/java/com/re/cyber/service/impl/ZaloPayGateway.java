package com.re.cyber.service.impl;

import com.re.cyber.service.PaymentGateway;
import org.springframework.stereotype.Component;

@Component("zaloGateway")
public class ZaloPayGateway implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan " + amount + " qua ZaloPay");
    }
}
