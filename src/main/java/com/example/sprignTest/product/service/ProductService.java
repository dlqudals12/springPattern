package com.example.sprignTest.product.service;

import com.example.sprignTest.product.data.entity.Product;
import com.example.sprignTest.product.data.repository.ProductRepository;
import com.example.sprignTest.product.processor.ProductProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final Map<Product.MallType, ProductProcessor> productProcessor;

    public void register(Product.MallType mallType, Long id) {
        Product product = productRepository.findById(id).orElseThrow();

        ProductProcessor processor = productProcessor.get(mallType);
        processor.register(product);
    }
}
