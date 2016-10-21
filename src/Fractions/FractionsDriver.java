package Fractions;

/**
 * Created by madmann on 10/10/16.
 */
public class FractionsDriver {
    public static void main(String[] args) {
        Fraction frac34=new Fraction(3,4);
        Fraction frac24=new Fraction(2,4);
        Fraction frac516=new Fraction(5,16);
        Fraction frac13=new Fraction(1,3);
        Fraction frac1224=new Fraction(12,24);
        Fraction frac312=new Fraction(3,12);
        System.out.println("Number One: "+frac34.add(frac24));
        System.out.println("Number Two: "+frac34.subtract(frac24));
        System.out.println("Number Three: "+frac34.multiply(frac24));
        System.out.println("Number Four: "+frac34.divide(frac24));
        System.out.println("Number Five: "+ frac516.add(frac13));
        System.out.println("Number Six: "+ frac516.subtract(frac13));
        System.out.println("Number Seven: "+ frac516.multiply(frac13));
        System.out.println("Number Eight: "+ frac516.divide(frac13));
        System.out.println("Number Nine: "+ frac1224.add(frac312));
        System.out.println("Number Ten: "+ frac1224.subtract(frac312));
        System.out.println("Number Eleven: "+ frac1224.multiply(frac312));
        System.out.println("Number Twelve: "+ frac1224.divide(frac312));



   }
}

