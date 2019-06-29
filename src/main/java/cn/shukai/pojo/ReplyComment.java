package cn.shukai.pojo;

public class ReplyComment {
    public int getReplyComment_id() {
        return replyComment_id;
    }

    public void setReplyComment_id(int replyComment_id) {
        this.replyComment_id = replyComment_id;
    }

    public int getReplyComment_parentid() {
        return replyComment_parentid;
    }

    public void setReplyComment_parentid(int replyComment_parentid) {
        this.replyComment_parentid = replyComment_parentid;
    }

    public String getReplyComment_content() {
        return replyComment_content;
    }

    public void setReplyComment_content(String replyComment_content) {
        this.replyComment_content = replyComment_content;
    }

    public int getReplyComment_from_uid() {
        return replyComment_from_uid;
    }

    public void setReplyComment_from_uid(int replyComment_from_uid) {
        this.replyComment_from_uid = replyComment_from_uid;
    }

    public String getReplyComment_from_name() {
        return replyComment_from_name;
    }

    public void setReplyComment_from_name(String replyComment_from_name) {
        this.replyComment_from_name = replyComment_from_name;
    }

    public int getReplyCommentt_to_uid() {
        return replyCommentt_to_uid;
    }

    public void setReplyCommentt_to_uid(int replyCommentt_to_uid) {
        this.replyCommentt_to_uid = replyCommentt_to_uid;
    }

    public String getReplyComment_to_name() {
        return replyComment_to_name;
    }

    public void setReplyComment_to_name(String replyComment_to_name) {
        this.replyComment_to_name = replyComment_to_name;
    }

    private int replyComment_id;
    private int replyComment_parentid;
    private String replyComment_content;
    private int replyComment_from_uid;
    private String replyComment_from_name;
    private int replyCommentt_to_uid;
    private String replyComment_to_name;
}
