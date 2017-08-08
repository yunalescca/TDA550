package state;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE STATE
public class Boat implements Conveyance {

    @Override
    public void moveForward() {
        System.out.println("Forward power to propeller");
    }

    @Override
    public void slowDown() {
        System.out.println("Reverse power to propeller");
    }
}
