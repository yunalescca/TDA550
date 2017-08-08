package observerPattern;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//EXAMPLE FROM LECTURE SLIDES
public class Main {

    public static void main(String[] args) {

        IntrusionDetector id = new IntrusionDetector();

        SysAdm adm_1 = new SysAdm(id, "Josse");
        SysAdm adm_2 = new SysAdm(id, "Mange");
        SysAdm adm_3 = new SysAdm(id, "Misty");

        adm_2.subscribe();
        adm_3.subscribe();

        id.someoneTriesToBreakIn();
    }
}
