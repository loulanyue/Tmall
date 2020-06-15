package com.yfy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yfy.common.utils.PageUtils;
import com.yfy.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author youfy
 * @email youfyu@163.com
 * @date 2020-06-15 22:48:56
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

