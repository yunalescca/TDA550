package observerPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//OBSERVER - SUBSCRIBER
public class SysAdm implements Observer {

    private Observable observable;
    private String name;

    public SysAdm(Observable observable, String name){
        this.observable = observable;
        this.name = name;
    }

    public void subscribe(){
        observable.addObserver(this);
    }

    //Is called when something changes in IntrusionDetector
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " got the message!");
    }
}
