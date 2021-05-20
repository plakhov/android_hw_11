package com.company;

public class Apple extends Fruit{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public float getWeight() {
        return 1.0f;
    }

    @Override
    public Apple clone() throws CloneNotSupportedException {
        super.clone();
        Apple newApple = new Apple();
        newApple.setName(this.getName());
        return newApple;
    }
}
