package com.nz.entity;

public class message {
    private int id;//消息id
    private int receiver_id;//接收者id
    private int sender_id;//发送者id
    private String content;//消息内容
    private String send_time;//发送时间

    public message() {
    }

    public message(int id, int receiver_id, int sender_id, String content, String send_time) {
        this.id = id;
        this.receiver_id = receiver_id;
        this.sender_id = sender_id;
        this.content = content;
        this.send_time = send_time;
    }

    @Override
    public String toString() {
        return "message{" +
                "id=" + id +
                ", receiver_id=" + receiver_id +
                ", sender_id=" + sender_id +
                ", content='" + content + '\'' +
                ", send_time='" + send_time + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(int receiver_id) {
        this.receiver_id = receiver_id;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSend_time() {
        return send_time;
    }

    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }
}
