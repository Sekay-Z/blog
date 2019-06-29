package cn.shukai.service;

import cn.shukai.pojo.Comment;
import cn.shukai.pojo.ReplyComment;

import java.util.List;

public interface CommentService {
    public void addComment(Comment comment);
    public void addReplyComment(ReplyComment replyComment);
    public List<Comment> findComment();
    public List<ReplyComment> findReplyComment();
}
