package com.example.sprignTest.product.template.jp;

import com.example.sprignTest.product.data.entity.Product;
import com.example.sprignTest.product.template.ProductJpTempl;

public class RakutenTempl extends ProductJpTempl {
    @Override
    public void business(Product product) {
        System.out.println("Rakuten business");
    }
}
