package com.underline.serviceimpl;


import com.underline.manager.BrandManager;
import com.mine.model.Brand;
import com.mine.service.BrandServiceEx;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BrandServiceExImpl implements BrandServiceEx {

    @Resource
    private BrandManager brandManager;


    @Override
    public void insert(Brand brand) {
        brandManager.insert(brand);
    }
}
