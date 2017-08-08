package decorator;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE DECORATOR
public class Ham extends SandwichDecorator {

    public Ham(Sandwich sandwich) {
        super(sandwich);
    }

    public String getName(){
        return super.getName() + " + Ham";
    }

    public double getPrice(){
        return super.getPrice() + 2.0;
    }
}
