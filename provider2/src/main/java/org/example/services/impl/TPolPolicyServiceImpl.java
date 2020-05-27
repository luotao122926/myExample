package org.example.services.impl;

import org.example.dao.TPolPolicyMapper;
import org.example.entity.TPolPolicy;
import org.example.services.TPolPolicyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class TPolPolicyServiceImpl implements TPolPolicyService {

    @Resource
    TPolPolicyMapper tPolPolicyMapper;

    @Override
    public String getPolicy(BigDecimal policyId) {
        TPolPolicy tPolPolicy = tPolPolicyMapper.selectByPrimaryKey(policyId);
        if(tPolPolicy != null){
            return "调用成功" + tPolPolicy.toString();
        }
        return "调用失败";
    }
}
