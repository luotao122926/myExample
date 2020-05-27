package org.example.service;

import org.example.service.impl.FeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "hello-spring-cloud-provider",fallback = FeignServiceHystrix.class)
public interface FeignService {

    @RequestMapping(value = "policy", method = RequestMethod.GET)
    public String FeignServiceTest(@RequestParam BigDecimal policyId);
}
