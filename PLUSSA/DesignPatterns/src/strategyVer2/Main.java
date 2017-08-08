package strategyVer2;

/**
 * Created by Yunalescca on 2017-08-08.
 */
public class Main {

    public static void main(String[] args) {
        Plumber plumber = new Plumber(new Hammer());
        plumber.unclogToilet();

        plumber.changeTool(new Screwdriver());
        plumber.unclogToilet();
    }
}
