

public class Person {
    
    private int destination;
    private static int idGen = 1;
    private int id;
    private boolean direction; //true for right, false for left
    private int startLocation;

    public Person(int myDestination, int myStart){
    id = idGen;
    startLocation = myStart;
    idGen ++;
    destination = myDestination;
    if (destination > startLocation){
        direction = true;
    }else {
        direction= false;
    }
    
}

public int getid(){
    return id;
}

public int getDestination(){
    return destination;
}

public boolean getDirection(){
    return direction;
}

public String toString(){
    return super.toString() + " ID : " + id + " Start " + startLocation + " Destination : " + destination + " Going right? : " + direction;
}

public int getStart(){
    return startLocation;
}


}
