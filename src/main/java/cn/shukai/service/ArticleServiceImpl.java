package cn.shukai.service;

import cn.shukai.dao.ArticleDao;
import cn.shukai.pojo.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("articleServiceImpl")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;
    @Override
    public article fingArticleById(Integer id) {
       return  articleDao.findArticleById(id);
    }
}
