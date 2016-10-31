package al223jw_assign2.Exersise2;

import java.util.ArrayList;
import java.util.Iterator;

public class Ferry implements FerryInterface {

    protected int MAX_PASSENGERS = 200;
    protected int MAX_VEHICLE = 200;
    private int vehicleSpace = 0;
    private int vehicleCost = 0;
    private int passengerCost = 0;
    private ArrayList<Passenger> passengers;
    private ArrayList<Vehicle> vehicles;

    public Ferry()
    {
        passengers = new ArrayList<>();
        vehicles = new ArrayList<>();
    }

    @Override
    public int countPassengers() {
        return passengers.size();
    }

    @Override
    public int countVehicleSpace() {
        return vehicleSpace;
    }

    @Override
    public int countMoney() {
        return vehicleCost + passengerCost;
    }

    @Override
    public void embark(Vehicle v)
    {
        if(hasSpaceFor(v))
        {
            vehicles.add(v);
            vehicleSpace += v.space;
            vehicleCost += v.cost;
            for (Passenger p : v.getPassenger()) {
                embark(p);
            }
        }
        else if(v.maxPassengers < v.noPassengers)
        {
            System.err.println("To manny passengers in the vehicle, some one have to leave.");
        }
        else
            System.err.println("No space left for that vehicle or the vehicle is already on the Ferry, current space is: " + countVehicleSpace() + "\n");
    }

    @Override
    public void embark(Passenger p) {
       if(hasRoomFor(p)) {
           passengers.add(p);
           passengerCost += p.cost;
       }
       else
           System.err.println("No space for passenger or the passenger is already on the Ferry, current space is: " + countPassengers() + "\n");

    }

    @Override
    public void disembark() {
        passengers.clear();
        vehicles.clear();
        vehicleSpace = 0;
    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {

        if(v.space + vehicleSpace <= MAX_VEHICLE && !vehicles.contains(v) && v.noPassengers <= v.maxPassengers )
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasRoomFor(Passenger p) {

        if(countPassengers() < MAX_PASSENGERS && !passengers.contains(p))
        {
            return true;
        }
        return false;
    }

    @Override
    public Iterator<Vehicle> iterator() {

        return new Iterator<Vehicle>() {
            private int count = 0;
            @Override
            public boolean hasNext()
            {

                return count < vehicles.size();
            }

            @Override
            public Vehicle next()
            {
                return vehicles.get(count++);
            }
        };
    }

    @Override
    public String toString() {
       String text = "";

        text += "Passengers: " + countPassengers() + "\n";
        text += "Vehicle space: " + countVehicleSpace() + "\n";
        text += "Current money earned: " + countMoney() + "\n\n\n" ;

        Iterator<Vehicle> iterator = vehicles.iterator();
        System.out.println("All vehicles on ferry: ");
        while(iterator.hasNext())
        {
             text += iterator.next().toString() + "\n";
        }

        return text;
    }
}
