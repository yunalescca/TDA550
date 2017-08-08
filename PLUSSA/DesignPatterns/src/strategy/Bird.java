package strategy;

/**
 * Created by Yunalescca on 2017-08-08.
 */
public class Bird extends Animal{

    public Bird(){
        System.out.println("Tweet");

        setFlyingType(new ItFlies());
    }
}
