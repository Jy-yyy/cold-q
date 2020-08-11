package com.spring.cold.service;

import com.spring.cold.mapper.DpUserRoleMapper;
import com.spring.cold.pojo.DpUserRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DpUserRoleService extends BaseService<DpUserRoleMapper, DpUserRole>{
    public List<DpUserRole> selectByUserId(String userId){
        return mapper.selectByUserId(userId);
    }
}
