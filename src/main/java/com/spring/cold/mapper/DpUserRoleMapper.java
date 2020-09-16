package com.spring.cold.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spring.cold.pojo.DpUserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DpUserRoleMapper extends BaseMapper<DpUserRole> {
    List<DpUserRole> selectByUserId(String userId);
}