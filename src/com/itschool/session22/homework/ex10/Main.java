package com.itschool.session22.homework.ex10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};
        swapPosition(numbers, 1, 3);
        System.out.println("============");
        swapPosition(numbers, -1, 3);
        System.out.println("============");

        String[] words = {"element1", "element2", "element3", "element4"};
        swapPosition(words, 4, 2);
        System.out.println("============");
        swapPosition(words, 5, 3);
        System.out.println("============");

    }

    private static <T> void swapPosition(T[] array, int posEl1, int posEl2) {

        if (array == null || posEl1 < 1 || posEl2 < 1 || posEl1 > array.length || posEl2 > array.length) {
            System.out.println("Either array is invalid or position is out of range");
            return;
        }

        T temp = array[posEl1-1];
        array[posEl1-1] = array[posEl2-1];
        array[posEl2-1] = temp;

        System.out.println(Arrays.toString(array));

    }
}
