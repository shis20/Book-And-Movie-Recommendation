package com.projectonlineorder.foodstore.ViewObejct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.math.BigDecimal;

public class ProductInfoVO {
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal  productPrice;

    @JsonProperty("descript")
    private String productDiscription;

    @JsonProperty("icon")
    private String productIcon;
}
