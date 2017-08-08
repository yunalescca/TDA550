package templateMethod;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//EXAMPLE FROM DEREK BANAS (YOUTUBE)
public class Main {

    public static void main(String[] args){

        Hoagie italianHoagie = new ItalianHoagie();
        italianHoagie.makeSandwich();

        System.out.println();

        Hoagie veggieHoagie = new VeggieHoagie();
        veggieHoagie.makeSandwich();

    }
}
