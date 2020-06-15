package com.yfy.gulimall.order.dao;

import com.yfy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author youfy
 * @email youfyu@163.com
 * @date 2020-06-15 22:45:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
