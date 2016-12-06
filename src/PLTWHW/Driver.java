package PLTWHW;

/**
 * Created by madmann on 12/5/16.
 */
public class Driver {
    public static void main (String[] args) {
        Calculator num1=new Calculator(1.5,5.5);
        Calculator num2=new Calculator(5.5,1.5);
        Calculator num3=new Calculator(1.5,7.25);
        Calculator num4=new Calculator(7.25,1.5);
        Calculator num5=new Calculator(1.5,9.25);
        Calculator num6=new Calculator(9.25,1.5);
        num1.print();
        num2.print();
        num3.print();
        num4.print();
        num5.print();
        num6.print();

    }
}
