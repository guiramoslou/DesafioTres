package com.company.services;

import com.company.services.MyClass;

public class FirstImplementation extends MyClass {

    public FirstImplementation(int size) {
        super(size);
    }

    @Override
    public void addElement(Object element) {
        if (this.MyArray.length == this.Index) {
            System.out.println("Você não pode mais adicionar elementos a este array");
        } else {
            this.MyArray[this.Index] = element;
            this.Index++;
        }
    }
}