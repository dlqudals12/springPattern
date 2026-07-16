package com.example.sprignTest.product.template;

import com.example.sprignTest.product.data.entity.Product;
import com.example.sprignTest.product.processor.ProductProcessor;

public abstract class ProductKrTempl implements ProductProcessor {

    @Override
    public void register(Product product) {
        System.out.println("KR Product start and do before");

        business();

        System.out.println("KR Product end and do after");
    }

    public abstract void business();
}
