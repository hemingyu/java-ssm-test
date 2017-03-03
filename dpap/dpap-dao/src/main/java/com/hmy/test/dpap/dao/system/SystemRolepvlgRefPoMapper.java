package com.hmy.test.dpap.dao.system;

import com.hmy.test.dpap.model.system.SystemRolepvlgRefPoKey;

public interface SystemRolepvlgRefPoMapper {
    int deleteByPrimaryKey(SystemRolepvlgRefPoKey key);

    int insert(SystemRolepvlgRefPoKey record);

    int insertSelective(SystemRolepvlgRefPoKey record);
}