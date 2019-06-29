package cn.shukai.dao;

import cn.shukai.pojo.User;

public interface UserDao {
    public void regist(User user);
    public User findUserByUsername(User user);
}
