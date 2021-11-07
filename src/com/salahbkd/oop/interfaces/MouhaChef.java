package com.salahbkd.oop.interfaces;

public class MouhaChef extends Person implements ChefDuties {

    MouhaChef(String name, String age) {
        super(name, age);
    }

    @Override
    public void cook() {
        System.out.println("Cooking by " + this.name + "...");
    }

    @Override
    public void planMenu() {
        System.out.println("Planning menu by " + this.name + "...");
    }

}
