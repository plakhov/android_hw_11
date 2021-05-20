package com.company;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public T get(int index) {
        return fruits.get(index);
    }

    public void putFruit(T fruit) {
        fruits.add(fruit);
    }

    public void putFruit(List<T> fruits) {
        this.fruits.addAll(fruits);
    }

    public float getWeight(){
        if (fruits.isEmpty()) {
            return 0;
        }
        return fruits.size()*fruits.get(0).getWeight();
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.000001;
    }

    public void shiftFruit(Box<T> box) {
        box.putFruit(fruits);
        fruits.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits.size() +
                "weight=" + getWeight() +
                '}';
    }
}
