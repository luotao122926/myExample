package org.example.controller;

import org.example.services.TPolPolicyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class TPolPolicyController {

    @Resource
    TPolPolicyService tPolPolicyService;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/policy", method = RequestMethod.GET)
    public String testPolicy(@RequestParam("policyId") BigDecimal policyId){
        String msg = tPolPolicyService.getPolicy(policyId);
        return "port" + port + "\n" + msg;
    }
}
