package com.example.sprignTest.payment.processor;

import com.example.sprignTest.payment.dto.PaymentDto;
import com.example.sprignTest.payment.enums.PaymentType;

public class KakaoPaymentProcessor implements PaymentProcessor {

    @Override
    public PaymentType paymentType() {
        return PaymentType.KAKAO;
    }

    @Override
    public void pay(PaymentDto paymentDto) {

    }
}
