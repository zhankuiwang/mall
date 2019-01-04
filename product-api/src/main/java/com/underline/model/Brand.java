package com.underline.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Brand implements Serializable {

    private Long id;

    private String brandName;
}
