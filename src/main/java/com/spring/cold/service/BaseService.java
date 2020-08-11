package com.spring.cold.service;

import com.spring.cold.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<T extends BaseMapper<V>,V> {
    @Autowired
    protected T mapper;
    public int deleteByPrimaryKey(String id){
        return mapper.deleteByPrimaryKey(id);
    }
    public int insert(V entity){
        return mapper.insert(entity);
    }
    public V selectByPrimaryKey(String id){
        return mapper.selectByPrimaryKey(id);
    }
    public int updateByPrimaryKey(V entity){
        return mapper.updateByPrimaryKey(entity);
    }
}
