package decorator;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//DECORATOR
public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich decoratedSandwich;

    public SandwichDecorator(Sandwich sandwich){
        decoratedSandwich = sandwich;
    }

    public String getName(){
        return decoratedSandwich.getName();
    }

    public double getPrice(){
        return decoratedSandwich.getPrice();
    }
}
