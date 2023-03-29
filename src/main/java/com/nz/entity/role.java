package com.nz.entity;

public class role {
    private int id;
    private int user_id;
    private String user_role;

    public role(int id, int user_id, String user_role) {
        this.id = id;
        this.user_id = user_id;
        this.user_role = user_role;
    }

    public role() {
    }

    @Override
    public String toString() {
        return "role{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", user_role='" + user_role + '\'' +
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

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }
}

