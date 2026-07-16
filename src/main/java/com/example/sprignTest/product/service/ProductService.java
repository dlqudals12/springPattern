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

    //등록된 processor template 불러옴
    private final Map<Product.MallType, ProductProcessor> productProcessor;

    /**
     * 상품등록
     */
    public void register(Product.MallType mallType, Long id) {
        //상품 검색
        Product product = productRepository.findById(id).orElseThrow();

        //타입별 processor 조회
        ProductProcessor processor = productProcessor.get(mallType);

        //상품등록
        processor.register(product);
    }
}
