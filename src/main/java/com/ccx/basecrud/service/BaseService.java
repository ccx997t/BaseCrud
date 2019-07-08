package com.ccx.basecrud.service;


import com.ccx.basecrud.dao.BaseMapper;
import com.github.pagehelper.PageInfo;


import java.util.List;
import java.util.Map;


public interface BaseService<T> extends BaseMapper<T> {

    public PageInfo findListByCondPageInfo(int pageNum, int pageSize, Map map);

}
