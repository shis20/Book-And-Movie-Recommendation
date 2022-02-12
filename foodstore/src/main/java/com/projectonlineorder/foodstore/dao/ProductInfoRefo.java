package com.projectonlineorder.foodstore.dao;

import com.projectonlineorder.foodstore.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRefo extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findbyProductStatus(Integer productStatus);
}
