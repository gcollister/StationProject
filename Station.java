import java.util.ArrayList;
public class Station {

    private int location;
    private ArrayList<Person> commuters;
    private static int idGen = 1;

    public Station(){
        location = idGen;
        idGen++;
        commuters = new ArrayList<Person>();
    }

    public void addCommuter(Person p){
        commuters.add(p);
    }

    public 
    
}
