package com.company;

public class Main {

    public static void main(String[] args) {

        MyClass myClass = new MyClass(10);

        myClass.addElementIntoIndex(1, 0);
        System.out.println(myClass.getElementByIndex(0));
        myClass.removeElementByIndex(0);

    }
}