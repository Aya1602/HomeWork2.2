package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Cat").print();
        createObject("Dog").print();
        createObject("Parrot").print();
    }

    public static Printable createObject (String className){

        Printable printable = null;
        switch (className){
            case "Cat":
                printable  = new Cat("Petya",10);
                break;
            case "Dog":
                printable = new Dog("Shrek", 150);
                break;
            case "Parrot":
                printable = new Parrot("Vovka", "Aleksey the Best!");
                break;

        }
        return printable;
    }
}
