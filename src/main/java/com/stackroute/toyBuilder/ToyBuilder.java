package com.stackroute.toyBuilder;
//Executable code
public class ToyBuilder {
    public static void main(String []args)
    {
        ToyTypes toyTypes= new ToyTypes();
        Parameters parameters=new Parameters();
        toyTypes.setStaticToys("Teddy Bear: ");
        System.out.println(toyTypes.getStaticToys());
        parameters.nonMovableToys();
        parameters.setColour("Red");
        System.out.println("Its Colour is: "+parameters.getColour());
        parameters.setPrice(600);
        System.out.println("Its price is: "+ parameters.getPrice());
//        for movable toys
        toyTypes.setMovableToys("Car: ");
        System.out.println(toyTypes.getMovableToys());
        parameters.toysMoving();
        parameters.setColour("Green");
        System.out.println("Its Colour is: "+parameters.getColour());
        parameters.setPrice(100);
        System.out.println("Its price is: "+ parameters.getPrice());
//        for toys that flies
        toyTypes.setToysThatfly("Helicopter: ");
        System.out.println(toyTypes.getToysThatfly());
        parameters.toysFlying();
        parameters.setColour("Yellow");
        System.out.println("Its Colour is: "+parameters.getColour());
        parameters.setPrice(150);
        System.out.println("Its price is: "+ parameters.getPrice());
//        for toys that both flies and moves
        toyTypes.setToysThatFlyAndMove("Plane: ");
        System.out.println(toyTypes.getToysThatFlyAndMove());
        parameters.toysMoving();
        parameters.toysFlying();
        parameters.setColour("Blue");
        System.out.println("Its Colour is: "+parameters.getColour());
        parameters.setPrice(250);
        System.out.println("Its price is: "+ parameters.getPrice());
    }
}
