package factoryMethod;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE PRODUCT
public class ConcreteProductB implements Product{
    @Override
    public String shipFrom() {
        return " from Spain";
    }
}
