package com.liuchao1991.service;

import java.io.Serializable;

/**
 * 通用业务接口
 *
 * @author liuchao
 * @date 2018/6/24 16:22
 */
public interface BaseService<E> {

    int deleteByPrimaryKey(Serializable id);

    int insert(E model);

    int insertSelective(E model);

    E selectByPrimaryKey(Serializable id);

    int updateByPrimaryKeySelective(E model);

    int updateByPrimaryKey(E model);
}
