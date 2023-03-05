package com.jk.service;


import com.jk.entity.UserInfo;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleService {

    @Autowired
    private KieBase kieBase;

    /**
     * 检查用户信息合法性规则
     *
     */
    public UserInfo executeUserInfoRule(UserInfo user) {
        KieSession kieSession = kieBase.newKieSession();
        kieSession.insert(user);
        kieSession.fireAllRules();
        kieSession.dispose();
        return user;
    }

}
