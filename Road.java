import java.util.ArrayList;

public class Road {
    private ArrayList<Station> stations;
    private ArrayList<Car> cars;


    public Road(){
        stations = new ArrayList<Station>();
        cars =  new ArrayList<Car>();
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
        for (Station s: stations){
            if (p.getStart() == s.getLocation()){
                s.addCommuter(p);
            }
        }
    }

    public void run(){
        for (Car c: cars){
            c.move();
        }
        for (Car c: cars){
            c.unload();
        }
        for (Car c: cars){
            if (c.hasRoom() == true){
                int a = c.getLocation();
                Station s = stations.get(a);
             for (Person p: s.getCommuters()){
                if (p.getDirection() == c.getDirection()){
                    c.addPassenger(p);
                }
            }
        }
    }
        
  
        }
    }

    


