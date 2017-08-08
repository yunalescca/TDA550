package strategy;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//CONTEXT
public class Animal {

    private Fly flyingType;

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingType(Fly flyingType){
        this.flyingType = flyingType;
    }
}
