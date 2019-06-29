package cn.shukai.service;

import cn.shukai.exception.UserException;
import cn.shukai.pojo.User;

public interface UserService {
    public void regist(User user) throws UserException;
    public User login(User user) throws UserException;
}
