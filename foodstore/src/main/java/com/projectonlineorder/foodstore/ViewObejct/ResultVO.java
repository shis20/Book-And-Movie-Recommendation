package com.projectonlineorder.foodstore.ViewObejct;
import lombok.Data;

@Data
public class ResultVO {
    private Integer code;
    private String msg;
    private T data;
}
