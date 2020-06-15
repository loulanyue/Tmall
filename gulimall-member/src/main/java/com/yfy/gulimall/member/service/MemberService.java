package com.yfy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yfy.common.utils.PageUtils;
import com.yfy.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author youfy
 * @email youfyu@163.com
 * @date 2020-06-15 22:51:25
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

