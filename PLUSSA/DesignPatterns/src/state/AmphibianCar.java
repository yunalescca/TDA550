package state;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONTEXT
public class AmphibianCar {

    private Conveyance state;
    private Conveyance car;
    private Conveyance boat;

    public AmphibianCar(){

        car = new Car();
        boat = new Boat();

        state = car;
    }

    public void go(){
        state.moveForward();
    }

    public void stop(){
        state.slowDown();
    }

    public void goLeft(){
        System.out.println("Turn wheels left");
    }

    public void goRight(){
        System.out.println("Turn wheels right");
    }

    public void prepareForWater(){
        System.out.println("Preparing amphibian car for water");
        state = boat;
    }

    public void prepareForLand(){
        System.out.println("Preparing amphibian car for land");
        state = car;
    }
}
