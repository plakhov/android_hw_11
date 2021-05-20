package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBoxFirst = new Box<>();
        Apple redApple = new Apple();
        redApple.setName("Red Apple");
        appleBoxFirst.putFruit(redApple);

        System.out.println(redApple.getName());
        System.out.println(appleBoxFirst.get(0).getName());
        redApple.setName("Green Apple");
        System.out.println(redApple.getName());
        System.out.println(appleBoxFirst.get(0).getName());


        appleBoxFirst.putFruit(new Apple());
        appleBoxFirst.putFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.putFruit(new Orange());
        orangeBox.putFruit(new Orange());

        System.out.println(orangeBox.compare(appleBoxFirst));
        System.out.println(appleBoxFirst.compare(orangeBox));

        Box<Apple> appleBoxSecond = new Box<>();
        appleBoxFirst.shiftFruit(appleBoxSecond);
        System.out.println(appleBoxSecond.getWeight());
        System.out.println(appleBoxFirst.getWeight());
    }

    public static <T> void task1(T[] array, int firstElement, int secondElement) {
        if (firstElement < 0 || firstElement >= array.length || secondElement < 0 || secondElement >= array.length) {
            throw new IllegalArgumentException();
        }
        T temp = array[firstElement];
        array[firstElement] = array[secondElement];
        array[secondElement] = temp;
    }

    public static <T> List<T> task2(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
