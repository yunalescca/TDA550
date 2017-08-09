package composite;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//LEAF
public class File extends Data {

    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    void list(String str) {
        System.out.println(str + name);
    }
}
