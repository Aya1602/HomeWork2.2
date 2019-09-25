package com.company;

public class Dog extends Shelter implements Printable{
    private int height;

    @Override
    public void print() {
        System.out.println("The height of dog = " + getHeight());
        System.out.println("Name of dog = " + getName());
    }

    public int getHeight() {
        return height;
    }

    public Dog(String name,int height) {
        super(name);
        this.height = height;
    }
}
