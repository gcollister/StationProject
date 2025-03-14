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
    return super.toString() + " \n" + "         " + " Destination : " + destination + " \n" + "         " + " CurrentLocation : " + currentLocation +  " \n" + "         " +" Going right? : " + direction + " \n" + "         " + " Passangers: " + passengers + "\n";
}

//passenger moved


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
 * will only return one person even if multiple available 
 * */ 

    public Person unload(){
    for (int i = 0; i < passengers.size(); i++){
        Person a = passengers.get(i);
        if(a.getDestination() == currentLocation || destination == currentLocation){
            passengers.remove(i);
            return a;

        }
    }
    return null;
}


    public void remove(Person p){
        passengers.remove(p);
    }

public boolean hasRoom(){
    return passengers.size() < 3;

    }




public void move(){
    if (currentLocation == destination){
        return;
    }
    if (direction == true){
        currentLocation ++;
    }else {
        currentLocation -- ;
    }
} 


public boolean getDirection(){
    return direction;
}

public int getLocation(){
    return currentLocation;
}

public ArrayList<Person> getPassengers(){
    return passengers;
}

public int getDestination(){
    return destination;
}

}



