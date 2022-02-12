package com.projectonlineorder.foodstore.service.implement;

import com.projectonlineorder.foodstore.dao.ProductInfoRefo;
import com.projectonlineorder.foodstore.dataobject.ProductInfo;
import com.projectonlineorder.foodstore.enums.ProductStatusEnums;
import com.projectonlineorder.foodstore.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public class productServiceImplement implements productService {
    @Autowired
    private ProductInfoRefo productInfoRefo;
    @Override
    public ProductInfo findOne(String productId) {
        return productInfoRefo.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRefo.findbyProductStatus(ProductStatusEnums.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoRefo.findAll((org.springframework.data.domain.Pageable) pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRefo.save(productInfo);
    }
}
