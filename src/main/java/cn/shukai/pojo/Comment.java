package cn.shukai.pojo;


import java.util.List;

public class Comment {
    private int comment_id;

    public int getComment_type() {
        return comment_type;
    }

    public void setComment_type(int comment_type) {
        this.comment_type = comment_type;
    }

    private int comment_type;
    private String comment_content;
    private int comment_from_uid;
    private long comment_time;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    private User user;

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public int getComment_from_uid() {
        return comment_from_uid;
    }

    public void setComment_from_uid(int comment_from_uid) {
        this.comment_from_uid = comment_from_uid;
    }

    public long getComment_time() {
        return comment_time;
    }

    public void setComment_time(long comment_time) {
        this.comment_time = comment_time;
    }
}
