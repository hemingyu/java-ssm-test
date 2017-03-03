package com.hmy.test.dpap.dao.system;

import com.hmy.test.dpap.model.system.SystemLogPo;

public interface SystemLogPoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemLogPo record);

    int insertSelective(SystemLogPo record);

    SystemLogPo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemLogPo record);

    int updateByPrimaryKey(SystemLogPo record);
}