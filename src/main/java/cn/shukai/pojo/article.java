package cn.shukai.pojo;

public class article {
    private int article_id;
    private String article_name;
    private long article_time;
    private int article_click;
    private int sort_article;
    private int user_id;
    private int type_id;
    private String article_content;

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    public String getArticle_name() {
        return article_name;
    }

    public void setArticle_name(String article_name) {
        this.article_name = article_name;
    }

    public long getArticle_time() {
        return article_time;
    }

    public void setArticle_time(long article_time) {
        this.article_time = article_time;
    }

    public int getArticle_click() {
        return article_click;
    }

    public void setArticle_click(int article_click) {
        this.article_click = article_click;
    }

    public int getSort_article() {
        return sort_article;
    }

    public void setSort_article(int sort_article) {
        this.sort_article = sort_article;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }
}
