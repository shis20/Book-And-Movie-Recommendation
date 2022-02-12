package com.projectonlineorder.foodstore.Controller;

import com.projectonlineorder.foodstore.ViewObejct.ProductInfoVO;
import com.projectonlineorder.foodstore.ViewObejct.ProductVO;
import com.projectonlineorder.foodstore.ViewObejct.ResultVO;
import com.projectonlineorder.foodstore.dataobject.ProductCategory;
import com.projectonlineorder.foodstore.dataobject.ProductInfo;
import com.projectonlineorder.foodstore.service.category;
import com.projectonlineorder.foodstore.service.productService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private productService productService;

    @Autowired
    private  category category;

    @GetMapping("/list")
    public ResultVO list(){

        List<ProductInfo> productInfoList = productService.findUpAll();
        List<Integer> categoryTypeList = new ArrayList<>();
        for(ProductInfo productInfo : productInfoList){
            categoryTypeList.add(productInfo.getCategoryType());
        }

        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory: productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo: productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
    }
}
