package al223jw_assign2.Exersise2.Vehicles;


import al223jw_assign2.Exersise2.Vehicle;

public class Bicycle extends Vehicle {

    private static int cost = 40;
    private static int space = 1;
    private static int passengerCost = 0;
    private static int maxPassengers = 1;

    public Bicycle()
    {
        super(cost, space, 1, passengerCost, maxPassengers);
    }

    public String toString()
    {
        String text = "{";
        text += "Bike" + ", " + cost + ", " + space + ", " + space + ", " + passengerCost + ", " + maxPassengers;


        return text + "}";
    }
}
