package com.liuchao1991.mapper;

import java.io.Serializable;

/**
 * 通用Mapper
 *
 * @author liuchao
 * @date 2018/6/24 16:26
 */
public interface BaseMapper<E> {

    int deleteByPrimaryKey(Serializable id);

    int insert(E model);

    int insertSelective(E model);

    E selectByPrimaryKey(Serializable id);

    int updateByPrimaryKeySelective(E model);

    int updateByPrimaryKey(E model);
}
