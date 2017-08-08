package bridge;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//EXAMPLE IS FROM LECTURE SLIDES
public class Main {

    public static void main(String[] args) {

        Vehicle bus = new Bus(new SmallEngine());
        bus.drive();
        System.out.println();
        bus.setEngine(new BigEngine());
        bus.drive();
        System.out.println();

        Vehicle car = new Car(new SmallEngine());
        car.drive();
        System.out.println();
        car.setEngine(new BigEngine());
        car.drive();
    }
}
