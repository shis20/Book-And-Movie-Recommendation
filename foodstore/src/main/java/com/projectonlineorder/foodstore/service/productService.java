package com.projectonlineorder.foodstore.service;

import com.projectonlineorder.foodstore.dataobject.ProductInfo;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface productService {
    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);

}
