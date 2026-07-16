package com.example.sprignTest.product.template;

import com.example.sprignTest.product.data.entity.Product;
import com.example.sprignTest.product.processor.ProductProcessor;

public abstract class ProductJpTempl implements ProductProcessor {

    @Override
    public void register(Product product) {
        System.out.println("JP Product start and do before");

        business(product);

        System.out.println("JP Product end and do after");
    }

    public abstract void business(Product product);
}
