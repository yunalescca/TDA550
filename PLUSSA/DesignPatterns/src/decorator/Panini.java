package decorator;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE COMPONENT
public class Panini implements Sandwich{
    @Override
    public String getName() {
        return "Panini";
    }

    @Override
    public double getPrice() {
        return 10.5;
    }
}
