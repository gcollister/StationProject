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
    
}

}