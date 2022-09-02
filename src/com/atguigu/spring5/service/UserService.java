package com.atguigu.spring5.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//在注解里面value属性值可以省略不写,
//如果不写,默认值是类名称,首字母小写 UserService==>>userService
@Component(value = "userService")       //(bean id="userService" class="")
public class UserService {

    public void add(){
        System.out.println("Service add.......");
    }
}
