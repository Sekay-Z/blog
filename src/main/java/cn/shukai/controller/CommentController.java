package cn.shukai.controller;


import cn.shukai.pojo.Comment;
import cn.shukai.pojo.ReplyComment;
import cn.shukai.service.CommentServiceImpl;
import cn.shukai.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentServiceImpl commentServiceImpl;

    @RequestMapping("/addComment")
    @ResponseBody
    public Result addComment(@RequestBody Comment comment){
        commentServiceImpl.addComment(comment);
        return new Result("留言成功");
    }

    @RequestMapping("/addReplyComment")
    @ResponseBody
    public Result addReplyComment(@RequestBody ReplyComment replyComment){
        commentServiceImpl.addReplyComment(replyComment);
        return new Result("留言成功");
    }

    @RequestMapping("/findAllComment")
    @ResponseBody
    public Map findAllComment(){
        List<Comment> commentList=commentServiceImpl.findComment();
        List<ReplyComment> replyCommentList=commentServiceImpl.findReplyComment();
        Map<String,Object> map=new HashMap<>();
        map.put("commentList",commentList);
        map.put("replyCommentList",replyCommentList);
        return map;
    }
}

