package com.spring.cold.service;

import com.spring.cold.mapper.DpUserMapper;
import com.spring.cold.pojo.DpUser;
import org.springframework.stereotype.Service;

@Service
public class DpUserService extends BaseService<DpUserMapper, DpUser> {
    public DpUser selectByAccount(String account){
        return mapper.selectByAccount(account);
    }
    public DpUser login(DpUser dpUser){
        return mapper.login(dpUser);
    }
}

