package com.simon.pojo;

public class Product {
    private int id;
    private String name;
    private float price;
    private int cid;

    public Product() {}

    public Product(int id, String name, float price, int cid) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cid = cid;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cid=" + cid +
                '}';
    }
}
