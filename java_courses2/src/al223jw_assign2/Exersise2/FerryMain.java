package al223jw_assign2.Exersise2;

import al223jw_assign2.Exersise2.Vehicles.Bicycle;
import al223jw_assign2.Exersise2.Vehicles.Bus;
import al223jw_assign2.Exersise2.Vehicles.Car;
import al223jw_assign2.Exersise2.Vehicles.Lorry;

public class FerryMain {
    public static void main(String[] args) {

        Ferry ferry = new Ferry();

        Passenger anton =  new Passenger(20);
        Bicycle bike = new Bicycle();
        Car greenCar = new Car(3);
        Bus bus = new Bus(15);
        Lorry lorry = new Lorry(2);


        // If a parameter is needed, the only parameter is going to be
        // the amount of passengers in a vehicle.
        // If there is more passengers than allowed, the ferry keeper
        // have to throw someone in the water.
        ferry.embark(anton);
        ferry.embark(bike);
        ferry.embark(greenCar);
        ferry.embark(bus);
        ferry.embark(new Bus(12));
        ferry.embark(lorry);
        ferry.embark(new Lorry(1));
        ferry.embark(new Bicycle());
        ferry.embark(new Car(4));
        ferry.embark(new Car(4));

           // Testing 200 bikes on the ferry.
//        for(int i = 0; i < 200; i++)
//        {
//            ferry.embark(new Bicycle());
//        }


        System.out.println(ferry.toString());

        System.out.println(ferry.hasRoomFor(anton));
        System.out.println(ferry.hasSpaceFor(bus));
        System.out.println("");
        System.out.println("");
        System.out.println("");


        ferry.disembark();

        System.out.println(ferry.toString());
    }
}
