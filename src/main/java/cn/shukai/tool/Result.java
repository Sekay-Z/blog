package cn.shukai.tool;

import cn.shukai.pojo.User;

import java.util.Map;

public class Result {
    private User user;

    public Result(User user, String message) {
        this.user = user;
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Result(Map<String, Object> map) {
        this.map = map;
    }

    private Map<String,Object> map;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public Result(String message) {
        this.message = message;
    }
}
