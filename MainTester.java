public class MainTester {
    
    public static void main(String[] args) {

        Road delMar = new Road();
        delMar.addStations();
        for (int i = 0; i < 10; i++){
            int a = (int) (Math.random() * 31 + 1);
            int b = (int) (Math.random() * 31 + 1);
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
        for (int i = 0; i < 10; i++){
            delMar.run();
        }

       
        System.out.println(delMar.checkPercentage());


    }
}
