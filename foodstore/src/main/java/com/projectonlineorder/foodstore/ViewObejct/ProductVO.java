package com.projectonlineorder.foodstore.ViewObejct;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.internal.$Gson$Types;
import lombok.Data;

import javax.validation.constraints.Max;

@Data
import java.util.List;

public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private Max.List<ProductInfoVO> productInfoVOS;
}
