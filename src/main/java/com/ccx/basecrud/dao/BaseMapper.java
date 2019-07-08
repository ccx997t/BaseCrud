package com.ccx.basecrud.dao;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {
    public List<T> findListByCond(Map map);

    public  int deleteByPrimaryKey(Integer id);

    public int insertSelective(T record);

    public  T selectByPrimaryKey(Integer id);

    public  int updateByPrimaryKeySelective(T record);

    public  int updateByPrimaryKey(T record);

    public int deleteByCond(Map map);

    public  int insertForeach(List list);
}
