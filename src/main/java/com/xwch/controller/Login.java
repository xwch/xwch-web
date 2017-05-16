package com.xwch.controller;

import com.xwch.base.bean.UserDAO;
import com.xwch.base.service.UserManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xwch on 2017/4/9.
 */
@Controller
public class Login {

    @Resource
    UserManager userManager;


    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model){
        if (username.equals("xwch") && password.equals("1111")){
            model.addAttribute("username",username);
            return "/jsp/ok.jsp";
        } else {
            return "/jsp/no.jsp";
        }
    }

    @RequestMapping("/user")
    @ResponseBody
    public List<UserDAO> queryUser(){
        UserDAO userDAO = new UserDAO();
        userDAO.setStat("USABLE");
        userDAO.setUserName("xwch");
        List<UserDAO> list = userManager.queryUserByUserName(userDAO);
        System.out.println("list--->"+list.toString());
        return list;
    }
}
