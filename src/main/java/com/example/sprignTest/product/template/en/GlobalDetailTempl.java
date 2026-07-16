package com.example.sprignTest.product.template.en;

import com.example.sprignTest.product.data.entity.Product;
import com.example.sprignTest.product.template.ProductGlobalTempl;

public class GlobalDetailTempl extends ProductGlobalTempl {
    @Override
    public void business(Product product) {
        System.out.println("global detail business");
    }
}
