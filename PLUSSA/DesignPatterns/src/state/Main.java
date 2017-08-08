package state;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//EXAMPLE FROM LECTURE SLIDES
public class Main {

    public static void main(String[] args){

        AmphibianCar a = new AmphibianCar();
        a.go();
        a.goLeft();
        a.stop();
        a.prepareForWater();
        a.go();
        a.goRight();
        a.stop();

    }
}
