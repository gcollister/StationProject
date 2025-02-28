import java.util.ArrayList;

public class Road {
    private ArrayList<Station> stations;
    private ArrayList<Car> cars;
    private ArrayList<Person> commuters;

    public Road(){
        stations = new ArrayList<Station>();
        cars =  new ArrayList<Car>();
        commuters = new ArrayList<Person>();
    }

    public void addCar(Car c){
        cars.add(c);
    }

    public void addStations(){
       for(int i = 1; i <= 32; i++) {
            Station s = new Station();
            stations.add(s);
       }
    }

    public String toString(){
        String s = "";
        String c = "";
        for (Station st : stations){
            s += st.toString();
            s += "\n";
        }
        for (Car car : cars){
            c += car.toString();
            c += "\n";
        }
        return super.toString() + "\n" + "Stations : " + "\n" + s + "\n" + "Cars : " + "\n" + c;
    }

    public Station getStation(int a){
        Station stat = null;
        for (Station s : stations){
            if (s.getLocation() == a){
                stat = s;
            }
        }
        return stat;
    }

    public void clockOut(Station s, Car c){
        if (c.getLocation() == s.getLocation()){
            cars.remove(c);
        }
    }

    public void addPerson(Person p){
        commuters.add(p);
    }

    public void assignCommuters(){
        for (int i = 0; i < 32; i++){
            for (int j = 0; j < commuters.size(); j++){
                if (commuters.get(j).getStart() == stations.get(i).getLocation()){
                    stations.get(i).addCommuter(commuters.get(j));
                }
            }
        
        }
    }

}
