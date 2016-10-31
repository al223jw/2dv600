package al223jw_assign2.Exersise2.Vehicles;

import al223jw_assign2.Exersise2.Vehicle;

public class Lorry extends Vehicle{

    private static int cost = 300;
    private static int space = 40;
    private static int passengerCost = 15;
    private static int maxPassengers = 2;

    public Lorry(int np)
    {
        super(cost, space, np, passengerCost, maxPassengers);
    }

    public String toString()
    {
        String text = "{";
        text += "Lorry" + ", " + cost + ", " + space + ", " + noPassengers + ", " + passengerCost + ", " + maxPassengers;


        return text + "}";
    }
}
