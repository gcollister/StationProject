import java.util.ArrayList;

public class Road {
    private ArrayList<Station> stations;
    private ArrayList<Car> cars;
    private static int numStations;
    private static int numP;


    public Road(){
        stations = new ArrayList<Station>();
        cars =  new ArrayList<Car>();
        numStations = 5;
        numP = 10;
    }

    public void addCar(Car c){
        cars.add(c);
    }

    public void addStations(){
       for(int i = 1; i <= numStations; i++) {
            Station s = new Station();
            stations.add(s);
       }
    }

    public void addCommuters(){
        for (int i = 0; i < numP; i++){
            int a = (int)(Math.random() * numStations);
            int b = (int)(Math.random() * numStations );
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
        for (Car c: cars){
            while (true){
           
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
        //printSuccess();
        loadCars();
        move();
    }

    public void unload(){
        for (Car c: cars){
            ArrayList<Person> unloaded = c.getPassengers();
            for (Person p : unloaded){
                Station s = stations.get(c.getLocation());
                s.addCommuter(p);
                c.remove(p);
            }
        }
    }

    

    public int checkPercentage(){
        int successful = 0;
        for (Station s : stations){
            ArrayList<Person> commuters = s.getCommuters();
            for (Person p : commuters){
                if (p.getDestination() == s.getLocation()){
                    successful++;
                }
            }
        }
        return successful;
    }



 }


    


