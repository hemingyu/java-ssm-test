package com.hmy.test.dpap.dao.system;

import com.hmy.test.dpap.model.system.SystemEmployeePo;

public interface SystemEmployeePoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemEmployeePo record);

    int insertSelective(SystemEmployeePo record);

    SystemEmployeePo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemEmployeePo record);

    int updateByPrimaryKey(SystemEmployeePo record);
}