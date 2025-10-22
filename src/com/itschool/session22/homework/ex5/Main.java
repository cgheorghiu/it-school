package com.itschool.session22.homework.ex5;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product("surub", 230, "leId1");
        Product prod2 = new Product("piulita", 23, "leId1");
        Product prod3 = new Product("surubelnita", 2000, "leId2");
        Product prod4 = new Product("surub", 230, "leId3");

        System.out.println("prod1 == prod2 ? - " + prod1.equals(prod2));
        System.out.println("prod1 == prod3 ? - " + prod1.equals(prod3));
        System.out.println("prod1 == prod4 ? - " + prod1.equals(prod4));
        System.out.println("hash for prod1 - " + prod1.hashCode());
        System.out.println("hash for prod2 - " + prod2.hashCode());
        System.out.println("hash for prod3 - " + prod3.hashCode());
        System.out.println("hash for prod4 - " + prod4.hashCode());


    }
}
