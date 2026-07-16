package com.example.sprignTest.product.template.kr;

import com.example.sprignTest.product.data.entity.Product;
import com.example.sprignTest.product.template.ProductKrTempl;

public class NaverTempl extends ProductKrTempl {
    @Override
    public void business(Product product) {
        System.out.println("Naver business");
    }
}
