package templateMethod;

/**
 * Created by Yunalescca on 2017-08-08.
 */
public class ItalianHoagie extends Hoagie {

    public ItalianHoagie(){
        System.out.println("Italian:");
    }

    @Override
    void addMeat() {
        System.out.println("Added meat");
    }

    @Override
    void addCheese() {
        System.out.println("Added cheese");
    }

    @Override
    void addVeggies() {
        System.out.println("Added veggies");
    }

    @Override
    void addCondiments() {
        System.out.println("Added condiments");
    }
}
