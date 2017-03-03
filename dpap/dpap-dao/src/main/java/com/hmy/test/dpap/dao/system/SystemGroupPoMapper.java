package com.hmy.test.dpap.dao.system;

import com.hmy.test.dpap.model.system.SystemGroupPo;

public interface SystemGroupPoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemGroupPo record);

    int insertSelective(SystemGroupPo record);

    SystemGroupPo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemGroupPo record);

    int updateByPrimaryKey(SystemGroupPo record);
}