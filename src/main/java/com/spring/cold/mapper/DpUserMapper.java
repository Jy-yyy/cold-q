package com.spring.cold.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spring.cold.pojo.DpUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DpUserMapper extends BaseMapper<DpUser> {
    DpUser selectByAccount(String account);
    DpUser login(DpUser dpUser);
}