package com.salahbkd.oop.interfaces;

public class ChefReport {

    private ChefDuties chef;

    ChefReport(ChefDuties chef) {
        this.chef = chef;
    }

    public void show() {
        chef.planMenu();
    }

    public void setChef(HananChef chefHanan) {
        this.chef = chefHanan;
    }
}
