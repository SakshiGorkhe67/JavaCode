package Collections.set;

import java.util.HashSet;

public class HashSetInterface {
    public static void main(String[] args) {
        HashSet<String> cars=new HashSet<String>();
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("Volvo");
        cars.add("BMW");
        System.out.println(cars);

    }
}
