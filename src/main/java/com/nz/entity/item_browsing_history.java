package com.nz.entity;
//商品浏览记录
public class item_browsing_history {
    private int id;//浏览记录id
    private int user_id;//用户id
    private int item_id;//商品id
    private String browse_time;//浏览时间

    public item_browsing_history() {
    }

    public item_browsing_history(int id, int user_id, int item_id, String browse_time) {
        this.id = id;
        this.user_id = user_id;
        this.item_id = item_id;
        this.browse_time = browse_time;
    }

    @Override
    public String toString() {
        return "item_browsing_history{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", item_id=" + item_id +
                ", browse_time='" + browse_time + '\'' +
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

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getBrowse_time() {
        return browse_time;
    }

    public void setBrowse_time(String browse_time) {
        this.browse_time = browse_time;
    }
}
