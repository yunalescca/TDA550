package observerPattern;

import java.util.Observable;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//OBSERVABLE - PUBLISHER
public class IntrusionDetector extends Observable {

    public void someoneTriesToBreakIn(){
        System.out.println("Someone tried to break in!");

        setChanged();
        notifyObservers();
    }
}
