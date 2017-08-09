package composite;

/**
 * Created by Yunalescca on 2017-08-08.
 */

//EXAMPLE FROM LECTURE SLIDES
public class Main {

    public static void main(String[] args) {
        Folder fol1 = new Folder("Folder 1");
        Folder fol2 = new Folder("Folder 2");
        Folder fol3 = new Folder("Folder 3");

        File file1 = new File("File 1");
        File file2 = new File("File 2");
        File file3 = new File("File 3");
        File file4 = new File("File 4");

        fol1.addData(file1);
        fol1.addData(fol3);
        fol2.addData(file2);
        fol3.addData(fol2);
        fol3.addData(file3);
        fol3.addData(file4);

        fol1.list("");
    }

}
