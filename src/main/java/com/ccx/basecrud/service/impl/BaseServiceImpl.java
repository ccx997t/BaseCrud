package com.ccx.basecrud.service.impl;

import com.ccx.basecrud.dao.BaseMapper;
import com.ccx.basecrud.service.BaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public abstract class BaseServiceImpl<T> implements BaseService<T> {



    protected abstract BaseMapper<T> getMapper();
    @Override
    public PageInfo findListByCondPageInfo(int pageNum, int pageSize, Map map)
    {
        PageHelper.startPage(pageNum, pageSize);
        List<T> userList = this.findListByCond(map);
        PageInfo<T> pageInfo = new PageInfo<>(userList);
        return pageInfo;

    }
    @Override
    public List findListByCond(Map map) {
        return this.getMapper().findListByCond(map);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(T record) {
        return this.getMapper().insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(Integer id) {
        return this.getMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return this.getMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return this.getMapper().updateByPrimaryKey(record);
    }

    @Override
    public int deleteByCond (Map map) {
        return this.getMapper().deleteByCond(map);
    }
    @Override
    public  int insertForeach(List list){
        return this.getMapper().insertForeach(list);
    }

}
