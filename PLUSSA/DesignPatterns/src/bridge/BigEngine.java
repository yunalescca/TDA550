package bridge;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE IMPLEMENTATION
public class BigEngine implements Engine {

    private int horsepower;

    public BigEngine(){
        horsepower = 350;
    }

    @Override
    public int go() {
        System.out.println("The big engine is running!");
        return horsepower;
    }
}
