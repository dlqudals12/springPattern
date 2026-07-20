package com.example.sprignTest.payment.dto;

import com.example.sprignTest.payment.enums.PaymentType;
import lombok.Getter;

@Getter
public class PaymentDto {

    private Long id;
    private PaymentType paymentType;
    private Long amount;
    private String name;

}
