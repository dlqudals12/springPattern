package com.example.sprignTest.payment.config;

import com.example.sprignTest.payment.enums.PaymentType;
import com.example.sprignTest.payment.processor.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CustomBeanPayment {

    @Bean
    public Map<PaymentType, PaymentProcessor> paymentProcessor() {
        Map<PaymentType, PaymentProcessor> paymentProcessor = new HashMap<>();

        paymentProcessor.put(PaymentType.CARD, new CardPaymentProcessor());
        paymentProcessor.put(PaymentType.CASH, new CashPaymentProcessor());
        paymentProcessor.put(PaymentType.NAVER, new NaverPaymentProcessor());
        paymentProcessor.put(PaymentType.KAKAO, new KakaoPaymentProcessor());

        return paymentProcessor;
    }
}
