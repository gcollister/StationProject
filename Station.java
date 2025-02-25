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

    public int getLocation(){
        return location;
    }

    public String toString(){
        return super.toString() + " Location : " + location + " Commuters : " + commuters;
    }
    
    public void loadCar(Car c){
        while ((c.hasRoom() == true)) {
            for (int i = 0; i < commuters.size(); i++){
                boolean sameDir = commuters.get(i).getDirection() == c.getDirection(); 
                    if (sameDir == true){
                        c.addPassenger(commuters.get(i));
                        commuters.remove(i);
                    }
            
            }
        }
    }
}


