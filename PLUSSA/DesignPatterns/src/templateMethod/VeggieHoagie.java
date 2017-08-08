package templateMethod;

/**
 * Created by Yunalescca on 2017-08-08.
 */
public class VeggieHoagie extends Hoagie{

    public VeggieHoagie(){
        System.out.println("Veggie:");
    }

    @Override
    public boolean customerWantsMeat(){
        return false;
    }

    public boolean customerWantsCheese(){
        return false;
    }

    @Override
    void addMeat(){}

    @Override
    void addCheese(){}

    @Override
    void addVeggies(){
        System.out.println("Added veggies");
    }

    @Override
    void addCondiments(){
        System.out.println("Added condiments");
    }
}
