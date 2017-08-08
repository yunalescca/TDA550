package strategy;

/**
 * Created by Yunalescca on 2017-08-08.
 */
public class Dog extends Animal {

    public Dog(){
        System.out.println("Bark");

        setFlyingType(new CantFly());
    }

}
