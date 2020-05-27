package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.entity.TPolPolicy;

import java.math.BigDecimal;

@Mapper
public interface TPolPolicyMapper {

    TPolPolicy selectByPrimaryKey(@Param("policyId") BigDecimal policyId);

}