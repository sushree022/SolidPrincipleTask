package com.stackroute.toyBuilder;

public class Toys {
    //    declaration of variables
    private int price;
    private String colour;

    // getters and setters
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void nonMovableToys() {
        System.out.println("This does not move");
    }

    public void toysMoving() {
        System.out.println("This moves");
    }

    public void toysFlying() {
        System.out.println("This flies");
    }
}
