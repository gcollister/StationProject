import java.util.ArrayList;
public class Car {

private int destination;
private boolean direction;
private int currentLocation;
private ArrayList<Person> passengers;

public Car(int myDestination, int myCurrentLocation){
    destination = myDestination;
    currentLocation = myCurrentLocation;
    passengers = new ArrayList<Person>();
    direction = destination > currentLocation;
}

public String toString(){
    return super.toString() + " Destination : " + destination + " CurrentLocation : " + " Going right? : " + direction + " Passangers: " + passengers;
}

public void addPassenger(Person p){
    if (passengers.size() >= 3){
        System.out.println("Error: no room");
    }else {
        passengers.add(p);
    }

}

public boolean hasRoom(){
    return passengers.size() < 3;

    }
}

