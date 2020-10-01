package com.company;

public class MyClass {
    public Object[] MyArray;
    public int MyArrayLenght;

    public MyClass(int myArrayLenght) {
        this.MyArrayLenght = myArrayLenght;
        MyArray = new Object[myArrayLenght];
    }

    public void addElementIntoIndex(Object element, int index) {
        this.MyArray[index] = element;
    }

    public void removeElementByIndex(int index) {
        this.MyArray[index] = null;
    }

    public Object getElementByIndex(int index) {
        return this.MyArray[index];
    }

    public void addElementIntoIndexVersionOne(Object element, int index) {
        if (MyArray.length > MyArrayLenght) {
            System.out.println("Você não pode adicionar mais elementos a esta array!");
        } else {
            this.MyArray[index] = element;
        }
    }

    public void addElementIntoIndexVersionTwo(Object element, int index) {
        if (MyArray.length > MyArrayLenght) {
            this.MyArray = new Object[MyArrayLenght * 2];
            this.MyArray[index] = element;
        } else {
            this.MyArray[index] = element;
        }
    }

    public void addElementIntoIndexVersionThree(Object element, int index) {
        if (MyArray.length > MyArrayLenght) {
            this.MyArray = new Object[(int) (MyArrayLenght * 1.5)];
            this.MyArray[index] = element;
        } else {
            this.MyArray[index] = element;
        }
    }

}