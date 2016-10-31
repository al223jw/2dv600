package al223jw_assign2.Exersise2.Vehicles;

import al223jw_assign2.Exersise2.Vehicle;

public class Bus extends Vehicle {
    private static int cost = 200;
    private static int space = 20;
    private static int passengerCost = 10;
    private static int maxPassengers = 20;

    public Bus(int np)
    {
        super(cost, space, np, passengerCost, maxPassengers);
    }

    public String toString()
    {
        String text = "{";
        text += "Bus" + ", " + cost + ", " + space + ", " + noPassengers + ", " + passengerCost + ", " + maxPassengers;


        return text + "}";
    }
}
