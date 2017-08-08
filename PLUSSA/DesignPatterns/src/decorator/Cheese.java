package decorator;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE DECORATOR
public class Cheese extends SandwichDecorator {

    public Cheese(Sandwich sandwich) {
        super(sandwich);
    }

    public String getName(){
        return super.getName() + " + Cheese";
    }

    public double getPrice(){
        return super.getPrice() + 1.5;
    }
}
