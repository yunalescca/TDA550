package decorator;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//EXAMPLE FROM LECTURE SLIDES
public class Main {

    public static void main(String[] args){

        Sandwich panini = new Panini();
        panini = new Ham(panini);
        panini = new Cheese(panini);

        System.out.println(panini.getName());
        System.out.println(panini.getPrice());

        //Sandwich secondPanini = new Cheese(new Ham(new Panini())); //alternative way of writing
    }

}
