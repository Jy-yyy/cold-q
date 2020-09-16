package com.spring.cold.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.spring.cold.mapper.DpUserRoleMapper;
import com.spring.cold.pojo.DpUserRole;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jy
 * @date 2020-09-16
 */
@Service
public class DpUserRoleServiceImpl extends ServiceImpI<DpUserRoleMapper, DpUserRole> {

    public List<DpUserRole> selectByUserId(String userId){
        return x.selectByUserId(userId);
    }
}
