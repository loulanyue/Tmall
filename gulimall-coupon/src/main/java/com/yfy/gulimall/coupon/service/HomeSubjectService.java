package com.yfy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yfy.common.utils.PageUtils;
import com.yfy.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author youfy
 * @email youfyu@163.com
 * @date 2020-06-15 22:48:56
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

