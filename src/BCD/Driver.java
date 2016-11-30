package BCD;

/**
 * Created by Luke Mann on 10/27/16.
 */
public class Driver {
    public static void main(String[] args) {
        BCD.factorial(52).print();
        BCD.factorial(104).print();
        BCD bcd1 = new BCD(2);
        bcd1.pow(127).print();
        BCD bcd2 = new BCD(19);
        bcd2.pow(19).print();
    }
}





