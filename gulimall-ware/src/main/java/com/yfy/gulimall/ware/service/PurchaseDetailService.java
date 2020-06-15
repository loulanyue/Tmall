package com.yfy.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yfy.common.utils.PageUtils;
import com.yfy.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author youfy
 * @email youfyu@163.com
 * @date 2020-06-15 22:53:28
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

