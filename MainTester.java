public class MainTester {
    
    public static void main(String[] args) {

        Road delMar = new Road();
        delMar.addStations();
        Car a = new Car(5, 1);
        Car b = new Car(30, 20);
        Car c = new Car(15, 31);
        Car d = new Car(5, 20);
        Car e = new Car(17, 18);
        delMar.addCar(a);
        delMar.addCar(b);
        delMar.addCar(c);
        delMar.addCar(d);
        delMar.addCar(e);
        
        System.out.println("Added Cars and Stations");




        delMar.addCommuters();


        System.out.println("Added People");
       
        System.out.println(delMar);

       
        System.out.println(" Run #1 ");
        System.out.println(delMar);

        


    }
}
