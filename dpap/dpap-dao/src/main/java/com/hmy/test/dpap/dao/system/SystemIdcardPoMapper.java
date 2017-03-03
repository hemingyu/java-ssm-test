package com.hmy.test.dpap.dao.system;

import com.hmy.test.dpap.model.system.SystemIdcardPo;

public interface SystemIdcardPoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemIdcardPo record);

    int insertSelective(SystemIdcardPo record);

    SystemIdcardPo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemIdcardPo record);

    int updateByPrimaryKey(SystemIdcardPo record);
}