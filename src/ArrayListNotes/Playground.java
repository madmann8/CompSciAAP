package ArrayListNotes;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by madmann on 11/28/16.
 */
public class Playground {
    public static void main(String[] args) {
        Integer y = 0;
        ArrayList list = new ArrayList();
        list.add(y);
        list.set(list.indexOf(y),4);
        System.out.println(list);

        Random rand=new Random();
        for (int i=0;i<9999999;i*=10){
            list.add(i);
        }
        for (Object num:list){
            System.out.println(num);
        }


    }
}
