package com.transport.controller;

import com.transport.entity.Result;
import com.transport.entity.User;
import com.transport.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public Result<List<User>> findUserList() {

        Result<List<User>> result = new Result<List<User>>();
        try {
            List<User> allUser = userService.findAllUser();
            result.setMsg("");
            result.setCode(1);
            result.setData(allUser);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg("获取数据失败");
            result.setCode(0);
            result.setData(new ArrayList<User>());

        }
        return result;
    }
}
