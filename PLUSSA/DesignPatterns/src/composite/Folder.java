package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//COMPOSITE
public class Folder extends Data {

    private String name;
    private List<Data> dataList = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void addData(Data data){
        dataList.add(data);
    }

    public void removeData(Data data){
        dataList.remove(data);
    }

    @Override
    void list(String str) {
        System.out.println(str + name);
        for(Data data : dataList){
            data.list(" " + str);
        }
    }
}
