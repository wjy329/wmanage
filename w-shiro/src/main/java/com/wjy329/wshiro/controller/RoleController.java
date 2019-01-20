package com.wjy329.wshiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author wjy329
 * @Time 2019/1/207:02 PM
 * @description
 */

@Controller
@RequestMapping("/role")
public class RoleController {
    @RequestMapping("/list")
    public String list(){
        return "role/list";
    }
}
