import java.util.ArrayList;
public class Station {

    private int location;
    private ArrayList<Person> commuters;
    private static int idGen = 0;

    public Station(){
        location = idGen;
        idGen++;
        commuters = new ArrayList<Person>();
    }

    public void addCommuter(Person p){
        commuters.add(p);
    }

    public int getLocation(){
        return location;
    }

    public ArrayList<Person> getCommuters(){
        return commuters;
    }

    

    public String toString(){
        return super.toString() + " \n" + "         " + " Location : " + location + " \n" + "         " + " Commuters : " + commuters + "\n";
    }

    
    
    public void loadCar(Car c){
        
            for (int i = 0; i < commuters.size(); i++){
                if ((c.hasRoom() == true) && (c.getLocation() != c.getDestination())) {
                    boolean sameDir = commuters.get(i).getDirection() == c.getDirection(); 
                        if (sameDir == true && (commuters.get(i).getDestination() != c.getLocation())){
                            c.addPassenger(commuters.get(i));
                            commuters.remove(i);
                            i--;
                        }
            
            }
        }
    }
}


