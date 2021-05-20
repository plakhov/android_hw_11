package com.company;

public class Orange extends Fruit {
    @Override
    public float getWeight() {
        return 1.5f;
    }

    @Override
    public Orange clone() throws CloneNotSupportedException {
        super.clone();
        return new Orange();
    }
}
