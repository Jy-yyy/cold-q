package com.spring.cold.security;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.spring.cold.pojo.DpUser;
import com.spring.cold.pojo.DpUserRole;
import com.spring.cold.service.imp.DpUserRoleServiceImpl;
import com.spring.cold.service.imp.DpUserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Slf4j
@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private DpUserServiceImpl dpUserService;
    @Autowired
    private DpUserRoleServiceImpl dpUserRoleService;

    @Override
    public UserDetails loadUserByUsername(String account) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        DpUser dpUser = dpUserService.getOne(new QueryWrapper<DpUser>().eq("account",account));
        if (dpUser==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<DpUserRole> userRoles = dpUserRoleService.selectByUserId(dpUser.getId());
        for (DpUserRole userRole : userRoles) {
            authorities.add(new SimpleGrantedAuthority(userRole.getName()));
        }
        return new CustomizeUser(dpUser.getId(),dpUser.getName(),dpUser.getAccount(),dpUser.getPassword(),authorities);
    }
}
