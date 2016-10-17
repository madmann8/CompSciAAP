package Fractions;

/**
 * Created by madmann on 10/10/16.
 */
public class FractionsDriver {
    public static void main(String[] args) {
        Fraction fraction1=new Fraction(2,1);
        Fraction fraction2=new Fraction(1,0);
        Fraction fraction3=new Fraction(fraction1);
        System.out.println("Fractions Added: "+fraction1.add(fraction2));
        System.out.println("Fractions Subtracted: "+fraction1.subtract(fraction2));
        System.out.println("Fractions Multiplied: "+fraction1.multiply(fraction2));
        System.out.println("Fractions Divided: "+fraction1.divide(fraction2));
        System.out.println(fraction3);
    }
}

