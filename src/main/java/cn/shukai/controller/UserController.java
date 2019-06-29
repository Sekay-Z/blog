package cn.shukai.controller;

import cn.shukai.exception.UserException;
import cn.shukai.pojo.User;
import cn.shukai.service.UserServiceImpl;
import cn.shukai.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    @ResponseBody
    public Result regist(@RequestBody User user){
        String message;
        try {
            userServiceImpl.regist(user);
            message ="注册成功！";
        } catch (UserException e) {
            message =e.getMessage();
        }
            return new Result(message);
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestBody User user){
        String message;
        User u=null;
        try {
            u=userServiceImpl.login(user);
            message="登录成功！";
        } catch (UserException e) {
            message=e.getMessage();
        }
        return new Result(u,message);
    }
}

