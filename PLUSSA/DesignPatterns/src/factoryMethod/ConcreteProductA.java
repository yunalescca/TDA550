package factoryMethod;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONCRETE PRODUCT
public class ConcreteProductA implements Product {
    @Override
    public String shipFrom() {
        return " from South Africa";
    }
}
