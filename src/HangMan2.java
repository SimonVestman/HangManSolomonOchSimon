import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangMan2 {
    public static void main(String [] args){
        Scanner sc = null;
        try {
            sc = new Scanner(new File("res/Ord.txt.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNext()){
            list.add(sc.next());
        }
        System.out.println(list);
    }
}
