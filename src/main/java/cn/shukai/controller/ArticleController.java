package cn.shukai.controller;

import cn.shukai.pojo.article;
import cn.shukai.service.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleServiceImpl articleServiceImpl;
    @RequestMapping(value = "/findArticleById/{id}")
    @CrossOrigin
    @ResponseBody
    public article findArticleById(/*Model model,*/@PathVariable("id") Integer id/*,HttpServletRequest request*/){
        //String id=request.getParameter("id");
        article article=articleServiceImpl.fingArticleById(id);
 /*       model.addAttribute("article",article);*/
        return article;
    }
}
