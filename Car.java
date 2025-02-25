import java.util.ArrayList;
public class Car {

private int destination;
private boolean direction; //true for right
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
    }else if(p.getDirection() != direction){
        System.out.println("Error: wrong direction");
    }else{
        passengers.add(p);
    }
    }

/** 
 * Method for handing back a person that is eligible to be dropped off
 * removed person from car as well
 * @return one person to be dropped off, null if nobody is available
 * will only return one person even if multiple availible 
 * */ 

    public Person unload(){
    for (int i = 0; i < passengers.size(); i++){
        Person a = passengers.get(i);
        if(a.getDestination() == currentLocation){
            passengers.remove(i);
            return a;
        }
    }
    return null;
}

public boolean hasRoom(){
    return passengers.size() < 3;

    }


public void move(){
    if (direction == true){
        currentLocation ++;
    }else if(direction == false){
        currentLocation --;
    }else if (currentLocation == destination){
        return;
    }
    }


public boolean getDirection(){
    return direction;
}
}



