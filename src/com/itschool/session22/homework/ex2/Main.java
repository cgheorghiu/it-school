package com.itschool.session22.homework.ex2;

public class Main {
    public static void main(String[] args) {
        Person vasilica = new Person("Vasilica", 29, "vasilica@gmail.com");
        Person vasilica2 = new Person("Vasilica", 29, "vasilicaB0$$@gmail.com");
        Person gigel = new Person("Gigel", 29, "gigel@gmail.com");
        Person vasilicaTheFirst = new Person("Vasilica The First", 64, "vasilicaTheFirst@gmail.com");

        System.out.println("vasilica and vasilica2 are the same:" + vasilica.equals(vasilica2));
        System.out.println("hash for vasilica is: " + vasilica.hashCode());
        System.out.println("hash for vasilica2 is: " + vasilica2.hashCode());
        System.out.println("Gigel is different:" + !gigel.equals(vasilica));
        System.out.println("hash for gigel is: " + gigel.hashCode());
        System.out.println("vasilicaTheFirst is also different: " + !vasilicaTheFirst.equals(vasilica));
        System.out.println("hash for vasilicaTheFirst is: " + vasilicaTheFirst.hashCode());
    }
}
