package com.nz.entity;

public class search_history {
    private int id;//搜索历史id
    private int user_id;//用户id
    private String keyword;//关键字
    private String search_time;//搜索时间

    public search_history() {
    }

    public search_history(int id, int user_id, String keyword, String search_time) {
        this.id = id;
        this.user_id = user_id;
        this.keyword = keyword;
        this.search_time = search_time;
    }

    @Override
    public String toString() {
        return "search_history{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", keyword='" + keyword + '\'' +
                ", search_time='" + search_time + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSearch_time() {
        return search_time;
    }

    public void setSearch_time(String search_time) {
        this.search_time = search_time;
    }
}
