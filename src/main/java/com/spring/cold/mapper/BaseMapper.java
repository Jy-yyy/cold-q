package com.spring.cold.mapper;


public interface BaseMapper<T> {
    int deleteByPrimaryKey(String id);
    int insert(T entity);
    T selectByPrimaryKey(String id);
    int updateByPrimaryKey(T entity);
}
