package com.company.services;

public abstract class MyClass {
    public Object[] MyArray;
    public int Size;
    public int Index = 0;

    public MyClass(int size) {
        this.Size = size;
        MyArray = new Object[this.Size];
    }

    public abstract void addElement(Object element);

    public void removeElementByIndex(int index) {
        this.MyArray[index] = null;
    }

    public Object getElementByIndex(int index) {
        return this.MyArray[index];
    }
}