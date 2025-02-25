public class Tester {
    
    public static void main(String[] args) {
        Person a = new Person(5, 7);
        Person b = new Person(2, 0);
        System.out.println(a);
        System.out.println(b);
        Car n = new Car(5, 9);
        System.out.println(n);
        n.addPassenger(a);
        System.out.println(n);
        }
    }

