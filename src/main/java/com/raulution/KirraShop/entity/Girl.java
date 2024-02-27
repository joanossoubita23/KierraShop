package com.raulution.KirraShop.entity;

public class Girl extends  Clothes{

    private  int size;
    private int age;





    public Girl(double price, int quantity, String name, int size, int age) {
        super(price, quantity, name);
        this.size = size;
        this.age = age;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
