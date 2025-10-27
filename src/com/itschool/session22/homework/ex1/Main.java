package com.itschool.session22.homework.ex1;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(12, 24);
        //testing for the same width and height
        Rectangle rectangle2 = new Rectangle(12, 24);
        //testing for variations of width and heights
        Rectangle rectangle3 = new Rectangle(22, 24);
        Rectangle rectangle4 = new Rectangle(12, 21);
        Rectangle rectangle5 = new Rectangle(212, 221);


        System.out.println("first rectangle equals the second one? " + rectangle1.equals(rectangle2));
        System.out.println("first rectangle equals the third one? " + rectangle1.equals(rectangle3));
        System.out.println("first rectangle equals the fourth one? " + rectangle1.equals(rectangle4));
        System.out.println("first rectangle equals the fifth one? " + rectangle1.equals(rectangle5));
        System.out.println("first rectangle hash:" + rectangle1.hashCode());
        System.out.println("second rectangle hash:" + rectangle2.hashCode());
        System.out.println("third rectangle hash:" + rectangle3.hashCode());
        System.out.println("fourth rectangle hash:" + rectangle4.hashCode());
        System.out.println("fifth rectangle hash:" + rectangle5.hashCode());

    }



}
