package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ludonglue on 2017/8/3.
 */
@Controller
public class IndexController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/add")
    public ModelAndView add(){
        User temp = new User();
        temp.setId(3);
        temp.setAge(10);
        temp.setName("Tim");
        userService.insertUser(temp);
        System.out.print("1111111111111111111111");
        return new ModelAndView("add");
    }
}
