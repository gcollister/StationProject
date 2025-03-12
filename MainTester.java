public class MainTester {
    
    public static void main(String[] args) {

        Road delMar = new Road();
        delMar.addStations();
        for (int i = 0; i < 5; i++){
            int a = (int) (Math.random() * 5 + 1);
            int b = (int) (Math.random() * 5 + 1);
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


    }
}
