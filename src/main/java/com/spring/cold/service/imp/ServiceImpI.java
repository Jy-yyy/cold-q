package com.spring.cold.service.imp;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author jy
 * @date 2020-09-16
 */
public class ServiceImpI<X extends BaseMapper<T>,T> implements IService<T> {
    @Autowired
    public X x;
    @Override
    public boolean save(T entity) {
        return x.insert(entity)>0;
    }

    @Override
    public boolean saveBatch(Collection<T> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<T> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean removeById(Serializable id) {
        return x.deleteById(id)>0;
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return x.deleteByMap(columnMap)>0;
    }

    @Override
    public boolean remove(Wrapper<T> queryWrapper) {
        return x.delete(queryWrapper)>0;
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return x.deleteBatchIds(idList)>0;
    }

    @Override
    public boolean updateById(T entity) {
        return x.updateById(entity)>0;
    }

    @Override
    public boolean update(T entity, Wrapper<T> updateWrapper) {
        return x.update(entity,updateWrapper)>0;
    }

    @Override
    public boolean updateBatchById(Collection<T> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(T entity) {
        return false;
    }

    @Override
    public T getById(Serializable id) {
        return (T) x.selectById(id);
    }

    @Override
    public Collection<T> listByIds(Collection<? extends Serializable> idList) {
        return x.selectBatchIds(idList);
    }

    @Override
    public Collection<T> listByMap(Map<String, Object> columnMap) {
        return x.selectByMap(columnMap);
    }

    @Override
    public T getOne(Wrapper<T> queryWrapper, boolean throwEx) {
        return (T) x.selectOne(queryWrapper);
    }

    @Override
    public Map<String, Object> getMap(Wrapper<T> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<T> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count(Wrapper<T> queryWrapper) {
        return x.selectCount(queryWrapper);
    }

    @Override
    public List<T> list(Wrapper<T> queryWrapper) {
        return x.selectList(queryWrapper);
    }

    @Override
    public IPage<T> page(IPage<T> page, Wrapper<T> queryWrapper) {
        return x.selectPage(page,queryWrapper);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<T> queryWrapper) {
        return x.selectMaps(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<T> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<T> page, Wrapper<T> queryWrapper) {
        return x.selectMapsPage(page,queryWrapper);
    }

    @Override
    public BaseMapper<T> getBaseMapper() {
        return x;
    }
}
