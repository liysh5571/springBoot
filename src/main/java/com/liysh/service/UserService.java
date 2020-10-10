package com.liysh.service;

import com.liysh.mapper.UserMapper;
import com.liysh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){
    //根据id查询
        return userMapper.selectByPrimaryKey(id);
    }
    //事务的注解配置
    @Transactional
    public void saveUser(User user){

        System.out.println("新增用户...");
        userMapper.insertSelective(user);
        //int i=1/0;
    }
}
