package al223jw_assign2.Exersise2;


import java.util.ArrayList;

public class Vehicle {
    protected int cost;
    protected int space ;
    protected int noPassengers;
    protected int maxPassengers;
    protected int costPerPassenger;
    protected ArrayList<Passenger> passengersInV = new ArrayList<>();

    public Vehicle(int c, int s, int np, int cp, int mp)
    {
        cost = c;
        space = s;
        noPassengers = np;
        costPerPassenger = cp;
        maxPassengers = mp;

        for(int i = 0; i < noPassengers; i++)
        {
            passengersInV.add(new Passenger(costPerPassenger));
        }
    }

    public ArrayList<Passenger> getPassenger()
    {
        return passengersInV;
    }

}
