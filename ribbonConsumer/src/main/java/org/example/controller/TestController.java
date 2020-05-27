package org.example.controller;

import org.example.service.TPolPolicyService;
import org.example.service.impl.TestImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class TestController {

    @Resource
    private TestImpl test;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String say(@RequestParam("policyId")BigDecimal policyId){
        String msg = test.test(policyId);
        return msg;
    }
}
