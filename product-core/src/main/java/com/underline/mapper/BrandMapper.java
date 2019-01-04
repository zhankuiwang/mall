package com.underline.mapper;

import com.mine.model.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface BrandMapper {

    @Insert("insert into t_brand(id,brand_name) values(#{brand.id},#{brand.brandName})")
    void insert(@Param("brand") Brand brand);

}
