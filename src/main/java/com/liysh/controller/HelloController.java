package com.liysh.controller;

import com.liysh.pojo.User;
import com.liysh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
//Controller里的方法都以json格式输出
@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Value("${itcast.url}")
    private String itcastUrl;

    @Value("${itheima.url}")
    private String itheimaUrl;
    @Autowired
    private UserService userService;

    /**
     * 根据用户id查询用户
     * @param id  用户id
     * @return
     */
    @GetMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
       return userService.queryById(id);
    }
    @GetMapping("hello")
    public String hello(){
        System.out.println("DataSource="+dataSource);
        System.out.println("DataSource="+itcastUrl);
        System.out.println("DataSource="+itheimaUrl);
        return "Hello,Spring Boot";
    }

}
