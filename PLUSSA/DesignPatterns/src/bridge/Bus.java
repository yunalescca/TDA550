package bridge;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//REFINED ABSTRACTION
public class Bus extends Vehicle {

    public Bus(Engine engine) {
        super(engine, 3000);
    }

    @Override
    void drive() {
        System.out.println("The bus is driving!");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
}
