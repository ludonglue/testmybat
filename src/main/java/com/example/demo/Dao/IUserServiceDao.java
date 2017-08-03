package com.example.demo.Dao;

import com.example.demo.Entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by ludonglue on 2017/8/3.
 */
@Repository
public interface IUserServiceDao {
    void insertUser(User user);
}
