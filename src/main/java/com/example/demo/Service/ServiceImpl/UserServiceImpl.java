package com.example.demo.Service.ServiceImpl;

import com.example.demo.Dao.IUserServiceDao;
import com.example.demo.Entity.User;
import com.example.demo.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ludonglue on 2017/8/3.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserServiceDao userServiceDao;
    @Override
    public void insertUser(User user) {
        userServiceDao.insertUser(user);
    }
}
