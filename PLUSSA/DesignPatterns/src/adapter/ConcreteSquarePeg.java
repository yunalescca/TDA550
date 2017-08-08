package adapter;

/**
 * Created by Yunalescca on 2017-08-08.
 */


public class ConcreteSquarePeg implements SquarePeg{
    @Override
    public void insert(String str) {
        System.out.println("Square peg insert: " + str);
    }
}
