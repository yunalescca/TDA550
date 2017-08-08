package adapter;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//EXAMPLE FROM LECTURE SLIDES
public class Main {

    public static void main(String[] args){
        SquarePeg concreteSquarePeg = new ConcreteSquarePeg();
        concreteSquarePeg.insert("Inserting concrete square peg!");

        RoundPeg roundPeg = new RoundPeg();
        roundPeg.insertIntoHole("Inserting round peg!");

        SquarePeg pegAdapter = new PegAdapter(roundPeg);
        pegAdapter.insert("Inserting round peg into adapter!");
    }


}
