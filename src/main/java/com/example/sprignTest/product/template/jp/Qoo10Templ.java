package com.example.sprignTest.product.template.jp;

import com.example.sprignTest.product.data.entity.Product;
import com.example.sprignTest.product.template.ProductJpTempl;

public class Qoo10Templ extends ProductJpTempl {
    @Override
    public void business(Product product) {
        System.out.println("Qoo10 business");
    }
}
