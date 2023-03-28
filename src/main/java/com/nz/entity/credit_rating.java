package com.nz.entity;

public class credit_rating {
    private int id;//评价id
    private int reviewer_id;//评价者id
    private int reviewed_id;//被评价者id
    private String content;//评价内容
    private String created_time;//评价内容

    public credit_rating() {
    }

    public credit_rating(int id, int reviewer_id, int reviewed_id, String content, String created_time) {
        this.id = id;
        this.reviewer_id = reviewer_id;
        this.reviewed_id = reviewed_id;
        this.content = content;
        this.created_time = created_time;
    }

    @Override
    public String toString() {
        return "credit_rating{" +
                "id=" + id +
                ", reviewer_id=" + reviewer_id +
                ", reviewed_id=" + reviewed_id +
                ", content='" + content + '\'' +
                ", created_time='" + created_time + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReviewer_id() {
        return reviewer_id;
    }

    public void setReviewer_id(int reviewer_id) {
        this.reviewer_id = reviewer_id;
    }

    public int getReviewed_id() {
        return reviewed_id;
    }

    public void setReviewed_id(int reviewed_id) {
        this.reviewed_id = reviewed_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }
}
