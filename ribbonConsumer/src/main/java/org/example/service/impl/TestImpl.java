package org.example.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.example.service.TPolPolicyService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class TestImpl implements TPolPolicyService{

    @Resource
    private RestTemplate restTemplate;

    public String error(BigDecimal policyId){
        return "开启熔断,调用政策ID为" + policyId + "服务出错" ;
    }

    @Override
    @HystrixCommand(fallbackMethod = "error")
    public String test(BigDecimal policyId) {
        String msg =restTemplate.getForObject("http://hello-spring-cloud-provider/policy?policyId=" +policyId, String.class );
        return msg;
    }
}
