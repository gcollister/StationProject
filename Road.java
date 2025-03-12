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

    public void addCommuters(){
        for (int i = 0; i < 50; i++){
            int a = (int)(Math.random() * 32 + 1);
            int b = (int)(Math.random() * 32 +1 );
            Person p = new Person(a, b);
            int start = p.getStart();
            stations.get(start).addCommuter(p);
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

    public void loadStations(){
        
        while (true){
            for (Car c: cars){
             //puts null if no one available
                Person p = c.unload();
                if (p != null){
                    int location = c.getLocation();
                    stations.get(location).addCommuter(p);
                } else{
                    break;
                }
            }
        }     
    }

    public void loadCars(){
        for(Car c: cars){
            for(Station s: stations){
                if (s.getLocation() == c.getLocation()){
                    s.loadCar(c);
                }
            }
        }
    }

    public void move(){
        for (Car c : cars){
            c.move();
        }
    }

    public void run(){
        loadStations();
        loadCars();
        move();
    }


 }


    


