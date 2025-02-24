import java.util.ArrayList;

public class Person {
    
    private int destination;
    private static int idGen = 1;
    private int id;

    public Person(int myDestination){
    id = idGen;
    idGen ++;
    destination = myDestination;
}

public int getid(){
    return id;
}

public int getDestination(){
    return destination;
}

public String toString(){
    return "ID : " + id + " destination : " + destination;
}


}
