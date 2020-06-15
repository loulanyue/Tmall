package com.yfy.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yfy.common.utils.PageUtils;
import com.yfy.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author youfy
 * @email youfyu@163.com
 * @date 2020-06-15 22:45:21
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

