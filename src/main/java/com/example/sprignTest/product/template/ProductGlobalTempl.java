package com.example.sprignTest.product.template;

import com.example.sprignTest.product.data.entity.Product;
import com.example.sprignTest.product.processor.ProductProcessor;

public abstract class ProductGlobalTempl implements ProductProcessor {

    @Override
    public void register(Product product) {
        System.out.println("Global Product start and do before");

        business();

        System.out.println("Global Product end and do after");
    }

    public abstract void business();
}
