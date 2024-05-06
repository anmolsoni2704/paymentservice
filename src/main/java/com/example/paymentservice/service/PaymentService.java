package com.example.paymentservice.service;

import com.example.paymentservice.dto.InitiatePaymentRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    void doPayment(String email, String phoneNumber, Double Amount, Long orderId) throws Exception;
}
