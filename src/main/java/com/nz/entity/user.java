package com.nz.entity;

public class user {
    private int id;//用户id
    private String name;//用户名
    private String student_id;//学号
    private String phone;//手机号
    private String email;//邮箱
    private String password;//密码
    private String identity_card;//身份证号
    private String credit_score;//信用评分

    public user() {
    }

    public user(int id, String name, String student_id, String phone, String email, String password, String identity_card, String credit_score) {
        this.id = id;
        this.name = name;
        this.student_id = student_id;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.identity_card = identity_card;
        this.credit_score = credit_score;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student_id='" + student_id + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", identity_card='" + identity_card + '\'' +
                ", credit_score='" + credit_score + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String identity_card) {
        this.identity_card = identity_card;
    }

    public String getCredit_score() {
        return credit_score;
    }

    public void setCredit_score(String credit_score) {
        this.credit_score = credit_score;
    }
}
