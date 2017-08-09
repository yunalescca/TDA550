package facade;

/**
 * Created by Yunalescca on 2017-08-09.
 */

//FACADE
public class Facade {

    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void operation1(){
        System.out.println("Operation 1\n" + subSystemA.a1() + subSystemA.a2() + subSystemB.b1());
    }

    public void operation2(){
        System.out.println("Operation 2\n" + subSystemB.b1() + subSystemC.c1());
    }

}
