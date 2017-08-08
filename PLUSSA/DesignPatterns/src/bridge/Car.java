package bridge;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//REFINED ABSTRACTION
public class Car extends Vehicle {


    public Car(Engine engine) {
        super(engine, 600);
    }

    @Override
    void drive() {
        System.out.println("The car is driving!");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
}
