package strategy;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE STRATEGY
public class ItFlies implements Fly {
    
    @Override
    public String fly() {
        return "Flying high";
    }
}
