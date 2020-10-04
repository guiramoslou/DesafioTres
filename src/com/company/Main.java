package com.company;

import com.company.services.FirstImplementation;
import com.company.services.MyClass;
import com.company.services.SecondImplementation;
import com.company.services.ThidImplementation;

public class Main {

    public static void main(String[] args) {
        /*MyClass myClass = new FirstImplementation(10);

        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);

        myClass.addElement(1);*/

        /*MyClass myClass = new SecondImplementation(10);

        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);

        myClass.addElement(2);
        myClass.addElement(2);
        myClass.addElement(2);
        myClass.addElement(2);
        myClass.addElement(2);
        myClass.addElement(2);
        myClass.addElement(2);
        myClass.addElement(2);
        myClass.addElement(2);
        myClass.addElement(3);


        System.out.println(myClass.getElementByIndex(19));*/

        MyClass myClass = new SecondImplementation(10);

        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);

        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(1);
        myClass.addElement(2);


        System.out.println(myClass.getElementByIndex(14));
        myClass.removeElementByIndex(14);
        System.out.println(myClass.getElementByIndex(14));
    }
}