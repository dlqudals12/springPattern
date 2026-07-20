package com.example.sprignTest.payment.service;

import com.example.sprignTest.payment.dto.PaymentDto;
import com.example.sprignTest.payment.enums.PaymentType;
import com.example.sprignTest.payment.processor.PaymentProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final Map<PaymentType, PaymentProcessor> paymentProcessor;

    public void payment(PaymentDto paymentDto) {
        paymentProcessor.get(paymentDto.getPaymentType()).pay(paymentDto);
    }
}
