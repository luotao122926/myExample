package org.example.service.impl;

import org.example.service.FeignService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class FeignServiceHystrix implements FeignService {

    @Override
    public String FeignServiceTest(BigDecimal policyId) {
        return "开启熔断，调用政策ID为" + policyId + "的服务失败";
    }
}
