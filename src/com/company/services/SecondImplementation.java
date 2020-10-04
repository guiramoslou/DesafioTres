package com.company.services;

import com.company.services.MyClass;

import java.util.Arrays;

public class SecondImplementation extends MyClass {
    public SecondImplementation(int size) {
        super(size);
    }

    @Override
    public void addElement(Object element) {
        if (this.MyArray.length == this.Index) {
            Object[] aux = Arrays.copyOf(this.MyArray, (this.Size * 2));
            this.MyArray = aux;
            this.MyArray[Index] = element;
            Index++;

        } else {
            this.MyArray[this.Index] = element;
            this.Index++;
        }
    }
}
