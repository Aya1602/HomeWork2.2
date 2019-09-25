package com.company;

public class Parrot extends Shelter implements Printable{
    private String voice;

    @Override
    public void print() {
        System.out.println(getVoice());
        System.out.println("Name of parrot = " + getName());
    }

    public String getVoice() {
        return voice;
    }

    public Parrot(String name,String voice) {
        super(name);
        this.voice = voice;
    }

}
