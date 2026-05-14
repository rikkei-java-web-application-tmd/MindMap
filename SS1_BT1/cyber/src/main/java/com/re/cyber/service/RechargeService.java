package com.re.cyber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RechargeService {

    private final PaymentGateway gateway;

    @Autowired
    public RechargeService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void processRecharge(String username, double amount) {
        gateway.pay(amount);
        System.out.println("Nap " + amount + " cho " + username);
    }
}
