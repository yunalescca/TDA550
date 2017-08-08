package strategyVer2;

/**
 * Created by Yunalescca on 2017-08-08.
 */
public class Plumber {

    private Tools tool;

    public Plumber(Tools tool){
        this.tool = tool;
    }

    public void changeTool(Tools tool){
        this.tool = tool;
    }

    public void unclogToilet(){
        tool.useTool();
    }

}
