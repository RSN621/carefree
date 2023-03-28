package com.nz.entity;

public class item {
    private int id;//商品id
    private String name;//商品名称
    private double price;//商品价格
    private String description;//商品描述
    private int seller_id;//卖家id
    private String image_url;//商品图片url

    public item() {
    }

    public item(int id, String name, double price, String description, int seller_id, String image_url) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.seller_id = seller_id;
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", seller_id=" + seller_id +
                ", image_url='" + image_url + '\'' +
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
