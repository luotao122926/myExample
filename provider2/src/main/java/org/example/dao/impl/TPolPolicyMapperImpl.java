package org.example.dao.impl;


import org.apache.ibatis.annotations.Mapper;
import org.example.dao.TPolPolicyMapper;
import org.example.entity.TPolPolicy;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Mapper
public class TPolPolicyMapperImpl implements TPolPolicyMapper {

    @Resource
    TPolPolicyMapper tPolPolicyMapper;

    @Override
    public TPolPolicy selectByPrimaryKey(BigDecimal policyId) {
        TPolPolicy tPolPolicy = tPolPolicyMapper.selectByPrimaryKey(policyId);
        return tPolPolicy;
    }
}
