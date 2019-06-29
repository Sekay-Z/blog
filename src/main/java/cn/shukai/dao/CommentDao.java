package cn.shukai.dao;

import cn.shukai.pojo.Comment;
import cn.shukai.pojo.ReplyComment;

import java.util.List;

public interface CommentDao {
    public void addComment(Comment comment);
    public void addReplyComment(ReplyComment replyComment);
    public List<Comment> findComment();
    public List<ReplyComment> findReplyComment();
}
