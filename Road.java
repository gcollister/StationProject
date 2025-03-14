import java.util.ArrayList;

public class Road {
    private ArrayList<Station> stations;
    private ArrayList<Car> cars;
    private static int numStations;
    private static int numP;


    public Road(){
        stations = new ArrayList<Station>();
        cars =  new ArrayList<Car>();
        numStations = 32;
        numP = 50;
    }
//adds a car to road given a car
    public void addCar(Car c){
        cars.add(c);
    }

//adds a number of stations at once
    public void addStations(){
       for(int i = 1; i <= numStations; i++) {
            Station s = new Station();
            stations.add(s);
       }
    }
//adds commuters based on variable at top
    public void addCommuters(){
        for (int i = 0; i < numP; i++){
            int a = (int)(Math.random() * numStations);
            int b = (int)(Math.random() * numStations);
            Person p = new Person(a, b);
            int start = p.getStart();
            stations.get(start).addCommuter(p);
        }
    }


//to strings the entire road
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
//returns a stations given its position
    public Station getStation(int a){
        Station stat = null;
        for (Station s : stations){
            if (s.getLocation() == a){
                stat = s;
            }
        }
        return stat;
    }

// adds a person given a person to a station that equals its start position
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

    //unloads cars, loads cars, moves everything
    public void run(){
        loadStations();
        loadCars();
        move();
    }

    //unloads all cars at end of trial
    //something wrong with the unload method, people are going missing

    
//prints the amount of people who made it to their destination out of people total
    public void checkPercentage(){
        int successful = 0;
        for (Station s : stations){
            ArrayList<Person> commuters = s.getCommuters();
            for (Person p : commuters){
                if (p.getDestination() == s.getLocation()){
                    successful++;
                }
            }
        }

        int total = 0;
        for (Station s : stations){
            ArrayList<Person> commuters = s.getCommuters();
            for (Person p : commuters){
                total ++;
            }
        }
        for (Car c : cars){
            for (Person p : c.getPassengers()){
                total ++;
            }
        }

        System.out.println(successful + " people made it out of " + total );

    }



 }


    


