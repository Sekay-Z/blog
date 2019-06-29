package cn.shukai.service;

import cn.shukai.dao.CommentDao;
import cn.shukai.pojo.Comment;
import cn.shukai.pojo.ReplyComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commentServiceImpl")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public void addComment(Comment comment) {
        commentDao.addComment(comment);
    }

    @Override
    public void addReplyComment(ReplyComment replyComment) {
        commentDao.addReplyComment(replyComment);
    }

    @Override
    public List<Comment> findComment() {
        return commentDao.findComment();
    }

    @Override
    public List<ReplyComment> findReplyComment() {
        return commentDao.findReplyComment();
    }

}


