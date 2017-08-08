package factoryMethod;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//EXAMPLE FROM LECTURE SLIDES
public class Main {

    public static void main(String[] args){

        Creator creator = new ConcreteCreatorA();

        for(int i = 1; i <= 12; i ++){
            Product product = creator.makeFactory(i);
            System.out.println("Avocados" + product.shipFrom());
        }

    }
}
