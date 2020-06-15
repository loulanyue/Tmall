package com.yfy.gulimall.coupon.dao;

import com.yfy.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author youfy
 * @email youfyu@163.com
 * @date 2020-06-15 22:48:56
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
