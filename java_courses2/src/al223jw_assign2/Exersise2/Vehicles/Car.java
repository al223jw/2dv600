package al223jw_assign2.Exersise2.Vehicles;

import al223jw_assign2.Exersise2.Vehicle;

public class Car extends Vehicle {

    private static int cost = 100;
    private static int space = 5;
    private static int passengerCost = 15;
    private static int maxPassengers = 4;

    public Car(int np)
    {
        super(cost, space, np, passengerCost, maxPassengers);
    }

    public String toString()
    {
        String text = "{";
        text += "Car" + ", " + cost + ", " + space + ", " + noPassengers + ", " + passengerCost + ", " + maxPassengers;


        return text + "}";
    }

}
