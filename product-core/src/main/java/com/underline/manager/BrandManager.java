package com.underline.manager;

import com.underline.mapper.BrandMapper;
import com.mine.model.Brand;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BrandManager {

    @Resource
    private BrandMapper brandMapper;

    public void insert(Brand brand) {
        brandMapper.insert(brand);
    }
}
