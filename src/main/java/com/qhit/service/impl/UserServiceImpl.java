package com.qhit.service.impl;

import com.qhit.dao.UserMapper;
import com.qhit.pojo.User;
import com.qhit.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMappper;
    @Override
    public int denglu(User user) {
        User u=userMappper.cha(user);
        if(u!=null){
            return 1;
        }
        return 0;
    }
}
