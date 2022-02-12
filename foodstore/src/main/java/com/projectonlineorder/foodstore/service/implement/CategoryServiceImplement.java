package com.projectonlineorder.foodstore.service.implement;

import com.projectonlineorder.foodstore.dao.repo;
import com.projectonlineorder.foodstore.dataobject.ProductCategory;
import com.projectonlineorder.foodstore.service.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImplement implements category {
    @Autowired
    private com.projectonlineorder.foodstore.dao.repo repo;
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repo.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repo.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repo.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repo.save(productCategory);
    }
}
