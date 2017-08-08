package strategy;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//EXAMPLE FROM DEREK BANAS (YOUTUBE)
public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog.tryToFly());

        Animal bird = new Bird();
        System.out.println(bird.tryToFly());

    }
}
