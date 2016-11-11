package BCD;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Created by madmann on 10/25/16.
 */
public class Driver {
    public static void main(String[] args) {
        BCD bcd=new BCD(387655888);
        //TODO: Fix array initialization
//        TODO: Ensure input etc. in array is in correct order
        Integer[] numbers= {3,9};
        BCD bcd2 = new BCD(numbers);
//        Todo: This prints backwards:
        bcd2.addBCD(bcd).print();
//TODO: Test using mutiplication test


    }
}





