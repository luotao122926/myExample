package org.example.controller;

import org.example.services.TPolPolicyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController("/test")
public class TPolPolicyController {

    @Resource
    private TPolPolicyService tPolPolicyService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/policy")
    public String testPolicy(@RequestParam("policyId") BigDecimal policyId){
        String msg = tPolPolicyService.getPolicy(policyId);
        return "port" + port + "\n" + msg;
    }

    public static void main(String[] args) {
        String msg = "asdfadsf,asdfs,asdfae,asdfaf";
        msg = msg.substring(0,msg.lastIndexOf(","));
        msg.length();
        System.out.println(msg);
    }
}
