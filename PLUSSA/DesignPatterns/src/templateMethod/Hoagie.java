package templateMethod;

/**
 * Created by Yunalescca on 2017-08-08.
 */
public abstract class Hoagie{

    //TEMPLATE METHOD
    final public void makeSandwich(){

        if(customerWantsMeat()){
            addMeat();
        }

        if(customerWantsCheese()){
            addCheese();
        }

        if(customerWantsVeggies()){
            addVeggies();

        }

        if(customerWantsCondiments()){
            addCondiments();

        }
    }

    //FORCE IMPLEMENTATION
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVeggies();
    abstract void addCondiments();

    //HOOKS: IMPLEMENTATION OPTIONAL
    protected boolean customerWantsMeat(){ return true; }
    protected boolean customerWantsCheese(){ return true; }
    protected boolean customerWantsVeggies(){ return true; }
    protected boolean customerWantsCondiments(){ return true; }

}
