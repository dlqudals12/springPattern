package com.example.sprignTest.product.config;

import com.example.sprignTest.product.data.entity.Product;
import com.example.sprignTest.product.processor.ProductProcessor;
import com.example.sprignTest.product.template.en.GlobalDetailTempl;
import com.example.sprignTest.product.template.jp.Qoo10Templ;
import com.example.sprignTest.product.template.jp.RakutenTempl;
import com.example.sprignTest.product.template.kr.CoopangTempl;
import com.example.sprignTest.product.template.kr.KakaoTempl;
import com.example.sprignTest.product.template.kr.NaverTempl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CustomBeanConfig {

    /**
     * 각 마켓별 processor template 등록
     */
    @Bean
    public Map<Product.MallType, ProductProcessor> productProcessor() {
        Map<Product.MallType, ProductProcessor> productProcessor = new HashMap<>();

        productProcessor.put(Product.MallType.COOPANG, new CoopangTempl());
        productProcessor.put(Product.MallType.KAKAO, new KakaoTempl());
        productProcessor.put(Product.MallType.NAVER, new NaverTempl());
        productProcessor.put(Product.MallType.RAKUTEN, new RakutenTempl());
        productProcessor.put(Product.MallType.QOO10, new Qoo10Templ());
        productProcessor.put(Product.MallType.GLOBAL_DETAIL, new GlobalDetailTempl());

        return productProcessor;
    }
}
