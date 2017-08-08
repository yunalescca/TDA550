package state;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE STATE
public class Car implements Conveyance {

    @Override
    public void moveForward() {
        System.out.println("Forward power to rear wheels");
    }

    @Override
    public void slowDown() {
        System.out.println("Apply breaks on each wheel");
    }
}
