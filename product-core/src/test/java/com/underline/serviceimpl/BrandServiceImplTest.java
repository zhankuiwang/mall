package com.underline.serviceimpl;


import com.mine.model.Brand;
import com.mine.service.BrandServiceEx;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * 这种测试没有事物回滚操作
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BrandServiceImplTest extends AbstractTestNGSpringContextTests {

    @Resource
    private BrandServiceEx brandServiceEx;

    @Test
    public void testInsert() {
        Brand brand = new Brand();
        brand.setId(31L);
        brand.setBrandName("波司登");
        brandServiceEx.insert(brand);
    }
}
