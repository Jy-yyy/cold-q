package com.spring.cold.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.spring.cold.mapper.DpUserMapper;
import com.spring.cold.pojo.DpUser;
import org.springframework.stereotype.Service;


/**
 * @author jy
 * @date 2020-09-16
 */
@Service
public class DpUserServiceImpl extends ServiceImpI<DpUserMapper, DpUser> {

    public DpUser selectByAccount(String account){
        return (DpUser) x.selectList(new QueryWrapper<DpUser>().eq("account",account));
    }
}
