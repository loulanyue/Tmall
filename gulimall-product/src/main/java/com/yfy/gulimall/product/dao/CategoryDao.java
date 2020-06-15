package com.yfy.gulimall.product.dao;

import com.yfy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author youfy
 * @email youfyu@163.com
 * @date 2020-06-15 22:40:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
