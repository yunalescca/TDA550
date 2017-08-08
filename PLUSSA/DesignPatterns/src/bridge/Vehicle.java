package bridge;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//ABSTRACTION
public abstract class Vehicle {

    protected Engine engine;
    private int weightInKilos;

    public Vehicle(Engine engine, int weightInKilos){
        this.engine = engine;
        this.weightInKilos = weightInKilos;
    }

    abstract void drive();

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public void reportOnSpeed(int horsepower){
        int ratio = weightInKilos / horsepower;

        if(ratio < 3){
            System.out.println("The vehicle is going at a fast speed");
        } else if (ratio >= 3 && ratio <= 8){
            System.out.println("The vehicle is going at an average speed");
        } else {
            System.out.println("The vehicle is going at a slow speed");
        }
    }
}
