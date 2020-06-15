package com.yfy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yfy.common.utils.PageUtils;
import com.yfy.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author youfy
 * @email youfyu@163.com
 * @date 2020-06-15 22:45:21
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

