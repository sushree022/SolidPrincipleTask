package com.stackroute.toyBuilder;

//Executable code
public class ToyBuilder {
    public static void main(String[] args) {
//        Instance of Toys and ToyType class created
        ToyTypes toyTypes = new ToyTypes();
        Toys toys = new Toys();
//       for static toys
        System.out.println("**** Details about the toy type 1 ****");
//        method of Toy Type class called
        toyTypes.nonMovableToys();
//        for movable toys
        System.out.println("**** Details about the toy type 2 ****");
//        method of Toy Type class called
        toyTypes.toysMoving();
//        for toys that flies
        System.out.println("**** Details about the toy type 3 ****");
//        method of Toy Type class called
        toyTypes.toysFlying();
//        for toys that both flies and moves
        System.out.println("**** Details about the toy type 4 ****");
//        methods of Toy Type class and Toys class called
        toyTypes.toysThatMovesAndFlies();
        toys.toysMoving();
        toys.toysFlying();
    }
}
