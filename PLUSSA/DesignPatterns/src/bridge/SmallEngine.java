package bridge;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE IMPLEMENTATION
public class SmallEngine implements Engine {

    private int horsepower;

    public SmallEngine(){
        horsepower = 100;
    }

    @Override
    public int go() {
        System.out.println("The small engine is running");
        return horsepower;
    }
}
