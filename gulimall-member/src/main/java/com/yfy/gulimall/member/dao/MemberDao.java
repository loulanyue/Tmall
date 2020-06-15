package com.yfy.gulimall.member.dao;

import com.yfy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author youfy
 * @email youfyu@163.com
 * @date 2020-06-15 22:51:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
