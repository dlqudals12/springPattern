package com.example.sprignTest.payment.processor;

import com.example.sprignTest.payment.dto.PaymentDto;
import com.example.sprignTest.payment.enums.PaymentType;

public class CashPaymentProcessor implements PaymentProcessor {

    @Override
    public PaymentType paymentType() {
        return PaymentType.CASH;
    }

    @Override
    public void pay(PaymentDto paymentDto) {

    }
}
