package com.itschool.session22.homework.ex11;

public class Pair<T, U> {
    private final T firstObj;
    private final U secondObj;

    public Pair(T firstObj, U secondObj) {
        this.firstObj = firstObj;
        this.secondObj = secondObj;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstObj=" + firstObj +
                ", secondObj=" + secondObj +
                '}';
    }
}
