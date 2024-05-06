package com.example.paymentservice.service;

import org.springframework.stereotype.Service;

@Service("stripe")
public class StripePaymentService implements PaymentService{

    @Override
    public void doPayment(String email, String phoneNumber, Double amount, Long orderId){

    }
}
