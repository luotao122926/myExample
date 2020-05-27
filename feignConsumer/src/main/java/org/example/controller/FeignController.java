package org.example.controller;

import org.example.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class FeignController {

    @Resource
    private FeignService feignService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String testFeign(@RequestParam BigDecimal policyId){
        return feignService.FeignServiceTest(policyId);
    };
}
