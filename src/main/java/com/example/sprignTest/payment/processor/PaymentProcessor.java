package com.example.sprignTest.payment.processor;

import com.example.sprignTest.payment.dto.PaymentDto;
import com.example.sprignTest.payment.enums.PaymentType;

public interface PaymentProcessor {

    PaymentType paymentType();

    void pay(PaymentDto paymentDto);
}
