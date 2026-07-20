package com.example.sprignTest.payment.processor;

import com.example.sprignTest.payment.dto.PaymentDto;
import com.example.sprignTest.payment.enums.PaymentType;

public class NaverPaymentProcessor implements PaymentProcessor {

    @Override
    public PaymentType paymentType() {
        return PaymentType.NAVER;
    }

    @Override
    public void pay(PaymentDto paymentDto) {

    }
}
