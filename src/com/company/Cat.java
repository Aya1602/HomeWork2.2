package com.company;

public class Cat extends Shelter implements Printable{
    private int weight;

    @Override
    public void print() {
        System.out.println("The weight of cat = " + getWeight());
        System.out.println("Name of cat = " + getName());
    }

    public int getWeight() {
        return weight;
    }

    public Cat(String name,int weight)
    {
        super(name);
        this.weight = weight;
    }
}
