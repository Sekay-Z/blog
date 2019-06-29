package cn.shukai.service;

import cn.shukai.dao.UserDao;
import cn.shukai.exception.UserException;
import cn.shukai.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void regist(User user) throws UserException {
        User u=userDao.findUserByUsername(user);
        if (u == null) {
            if(user.getUsername()==null||user.getUsername().length()==0||user.getPassword()==null||user.getPassword().length()==0){
                throw new UserException("注册失败!");
            }
            if(user.getUsername().length()<5||user.getUsername().length()>13||user.getPassword().length()<5||user.getPassword().length()>13){
                throw new UserException("注册失败!");
            }
            userDao.regist(user);
        }else{
        throw new UserException("用户名已被注册!");
        }
    }

    @Override
    public User login(User user) throws UserException {
        User u=userDao.findUserByUsername(user);
        if(u==null){
            throw new UserException("用户还未注册！");
        }else if(!u.getPassword().equals(user.getPassword())){
            throw new UserException("密码错误！");
        }else{
            return u;
        }
    }
}