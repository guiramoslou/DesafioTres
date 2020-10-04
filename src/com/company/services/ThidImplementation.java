package com.company.services;

import com.company.services.MyClass;

import java.util.Arrays;

public class ThidImplementation extends MyClass {
    public ThidImplementation(int size) {
        super(size);
    }

    @Override
    public void addElement(Object element) {
        if (this.MyArray.length == this.Index) {
            Object[] aux = Arrays.copyOf(this.MyArray, (int) (this.Size * 1.5));
            this.MyArray = aux;
            this.MyArray[Index] = element;
            Index++;

        } else {
            this.MyArray[this.Index] = element;
            this.Index++;
        }
    }
}