package com.transport.controller;

import com.transport.entity.User;
import com.transport.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chen on 2018/1/4.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "userLists")
    public Map<String, Object> findUserList() {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<User> allUser = userService.findAllUser();
            map.put("code", 1);
            map.put("list", allUser);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", 0);
        }
        return map;
    }
}
