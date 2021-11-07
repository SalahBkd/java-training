package com.salahbkd.oop.interfaces;

public class Main {

    public static void main(String[] args) {
        HananChef chefHanan = new HananChef("hanan", "37");
        MouhaChef chefMouha = new MouhaChef("mouha", "32");
        // constructor injection
        ChefReport report = new ChefReport(chefMouha);
        // setter injection
        report.setChef(chefHanan);
        report.show();
    }

}
