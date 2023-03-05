package com.jk.service;

import com.jk.entity.UserInfo;
import com.jk.springbootdrools.SpringBootDroolsApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= SpringBootDroolsApplication.class)
public class RuleServiceTest {

    @Autowired
    private RuleService ruleService;


    @Test
    public void executeUserInfoRule() throws Exception {
        UserInfo u = new UserInfo();
        u.setHouse(null);
        u.setCar(null);
        u.setEducation("大专以下");
        u.setSalary(100d);
        ruleService.executeUserInfoRule(u);
        assert !u.isFlag();
    }

}