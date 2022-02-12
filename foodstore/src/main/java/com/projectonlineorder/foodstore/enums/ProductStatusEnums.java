package com.projectonlineorder.foodstore.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnums {
    UP(0, "inStock"),
    Down(1 ,"outofstock");
    private Integer code;
    private String message;
    ProductStatusEnums(Integer code, String message){
        this.code = code;
        this.message = message;
    }

}
