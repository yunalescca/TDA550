package factoryMethod;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE CREATOR / CONCRETE FACTORY
public class ConcreteCreatorA implements Creator{

    @Override
    public Product makeFactory(int month) {
        if(month >= 4 && month <= 11){
            return new ConcreteProductA();
        } else if(month == 1 || month == 2 || month == 12){
            return new ConcreteProductB();
        } else {
            return new DefaultProduct();
        }
    }
}
