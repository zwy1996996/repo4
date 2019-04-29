package cn.itheima.domain;

public class Headset {
    private int id;
    private String brand;
    private double price;
    private String name;
    private String desc;

    public Headset() {
    }

    public Headset(int id, String brand, double price, String name, String desc) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.name = name;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
