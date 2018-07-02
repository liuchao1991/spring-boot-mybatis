package com.liuchao1991.service.impl;

import com.liuchao1991.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * 通用业务类
 *
 * @author liuchao
 * @date 2018/6/24 16:25
 */
public class BaseServiceImpl<E> {

    @Autowired
    private BaseMapper<E> baseMapper;

    public int deleteByPrimaryKey(Serializable id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    public int insert(E model) {
        return baseMapper.insert(model);
    }

    public int insertSelective(E model) {
        return baseMapper.insertSelective(model);
    }

    public E selectByPrimaryKey(Serializable id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(E model) {
        return baseMapper.updateByPrimaryKeySelective(model);
    }

    public int updateByPrimaryKey(E model) {
        return baseMapper.updateByPrimaryKey(model);
    }
}
