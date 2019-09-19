package com.ay.controller;

import com.ay.model.AyUser;
import com.ay.service.AyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户控制层
 *@author Ay
 * @date 2018/04/02
 */
@Controller
@RequestMapping("/user")
public class AyUserController {
    @Resource
    private AyUserService ayUserService;
    @GetMapping("/findAll")
    public String findAll(Model model){
        List<AyUser> ayUserList = ayUserService.findAll();
        for (AyUser ayUser:ayUserList){
            System.out.println(ayUser.getId());
            System.out.println(ayUser.getName());
        }
        return "hello";
    }
}
