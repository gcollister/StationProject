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

        System.out.println(delMar);

        Person one = new Person(3, 17);
        Person two = new Person(30, 20);
        Person three = new Person(20, 2);
        Person four = new Person(10, 7);
        Person five = new Person(15, 25);
        Person six = new Person(23, 6);

        delMar.addPerson(one);
        delMar.addPerson(two);
        delMar.addPerson(three);
        delMar.addPerson(four);
        delMar.addPerson(five);
        delMar.addPerson(six);

        delMar.assignCommuters();
        System.out.println("Added People");
       
       
        System.out.println(delMar);


    }
}
