package com.jk.entity;

import lombok.Data;

@Data
public class UserInfo {

    private String name;

    private Integer age;

    //是否有房
    private String house;

    //是否有车
    private String car;

    //受教育程度
    private String education;

    //薪水
    private Double salary;

    //是否有信用卡
    private Boolean hasCreditCard;

    //信用卡数量
    private Integer creditCardCount;

    //是否能够申请信用卡
    private boolean flag;
}