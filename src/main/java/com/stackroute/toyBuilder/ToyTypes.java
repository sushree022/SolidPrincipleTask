package com.stackroute.toyBuilder;

// SubClass of Toys class
public class ToyTypes extends Toys {
    //    OverRide method to give details about static toys
    @Override
    public void nonMovableToys() {
        System.out.println("Teddy Bear: ");
        setColour("Brown");
        setPrice(850);
        System.out.println("Its colour is " + getColour());
        System.out.println("Its Price is " + getPrice());
        super.nonMovableToys();
    }

    //    OverRide method to give details about movable toys
    @Override
    public void toysMoving() {
        System.out.println("Car: ");
        setColour("Green");
        setPrice(180);
        System.out.println("Its colour is " + getColour());
        System.out.println("Its Price is " + getPrice());
        super.toysMoving();
    }

    //    OverRide method to give details about flying toys
    @Override
    public void toysFlying() {
        System.out.println("Helicopter");
        setColour("Yellow");
        setPrice(200);
        System.out.println("Its colour is " + getColour());
        System.out.println("Its Price is " + getPrice());
        super.toysFlying();
    }

    //    Method to give details about toys that can fly and move
    public void toysThatMovesAndFlies() {
        System.out.println("Plane: ");
        setColour("White");
        setPrice(300);
        System.out.println("Its colour is " + getColour());
        System.out.println("Its Price is " + getPrice());
    }
}
