public class MainTester {
    
    public static void main(String[] args) {
        int amtofCars = 3;
        int numStations = 5;
        int numP = 10;

        Road delMar = new Road();
        delMar.addStations();
        for (int i = 0; i < amtofCars; i++){
            int a = (int) (Math.random() * numStations);
            int b = (int) (Math.random() * numStations);
            Car c = new Car(a, b);
            delMar.addCar(c);
        }
        
      
        
        System.out.println("Added Cars and Stations");




        delMar.addCommuters();


        System.out.println("Added People");
       
        System.out.println(delMar);

        delMar.run();
        System.out.println(" Run #1 ");
        System.out.println(delMar);
        
        delMar.run();
        System.out.println();
        System.out.println("Run #2");
        System.out.println(delMar);
        int a = delMar.checkPercentage();
        System.out.println(a);
        System.out.println();
        for (int i = 0; i < 50; i++){
            delMar.run();
        }

       
        System.out.println(delMar.checkPercentage());


    }
}
