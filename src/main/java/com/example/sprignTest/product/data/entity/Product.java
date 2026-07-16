package com.example.sprignTest.product.data.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Builder
@AllArgsConstructor
public class Product {

    public enum Solution {
        KR, JP, GLOBAL
    }

    public enum MallType {
        COOPANG, KAKAO, NAVER, RAKUTEN, QOO10, GLOBAL_DETAIL
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

}
