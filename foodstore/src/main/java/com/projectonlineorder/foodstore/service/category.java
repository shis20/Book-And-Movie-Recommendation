package com.projectonlineorder.foodstore.service;

import com.projectonlineorder.foodstore.dataobject.ProductCategory;

import java.util.List;

public interface category {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);

}
