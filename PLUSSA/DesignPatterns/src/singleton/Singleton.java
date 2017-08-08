package singleton;

/**
 * Created by Yunalescca on 2017-08-08.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    public Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
