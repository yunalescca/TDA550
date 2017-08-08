package adapter;

/**
 * Created by Yunalescca on 2017-08-08.
 */
public class PegAdapter implements SquarePeg {

    RoundPeg roundPeg;

    public PegAdapter(RoundPeg roundPeg){
        this.roundPeg = roundPeg;
    }

    @Override
    public void insert(String str) {
        roundPeg.insertIntoHole(str);
    }
}
