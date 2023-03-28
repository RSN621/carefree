package com.nz.entity;

public class transaction {
    private int id;//交易id
    private int buyer_id;//买家id
    private int seller_id;//卖家id
    private int item_id;//商品id
    private String transaction_time;//交易时间
    private String transaction_location;//交易地点

    public transaction() {
    }

    public transaction(int id, int buyer_id, int seller_id, int item_id, String transaction_time, String transaction_location) {
        this.id = id;
        this.buyer_id = buyer_id;
        this.seller_id = seller_id;
        this.item_id = item_id;
        this.transaction_time = transaction_time;
        this.transaction_location = transaction_location;
    }

    @Override
    public String toString() {
        return "transaction{" +
                "id=" + id +
                ", buyer_id=" + buyer_id +
                ", seller_id=" + seller_id +
                ", item_id=" + item_id +
                ", transaction_time='" + transaction_time + '\'' +
                ", transaction_location='" + transaction_location + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(int buyer_id) {
        this.buyer_id = buyer_id;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getTransaction_time() {
        return transaction_time;
    }

    public void setTransaction_time(String transaction_time) {
        this.transaction_time = transaction_time;
    }

    public String getTransaction_location() {
        return transaction_location;
    }

    public void setTransaction_location(String transaction_location) {
        this.transaction_location = transaction_location;
    }
}
