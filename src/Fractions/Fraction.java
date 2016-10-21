package Fractions;

import java.lang.*;

/**
 * Created by Luke Mann on 10/10/16.
 * The Fraction class represents a single fraction.
 * The Fraction class contains two int values that that represent the numerator and denominator in a fraction.
 * The class provides public methods that add, subtracts, divides, and multiplies the Fraction by an inputted fraction and
 * outputs Fraction that represents the result of the mathematical operation
 * The class is constructed by either passsing in a numerator and denominator or passing in a Fraction to be cloned.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    //Constructor that takes a numerator and denominator and makes then the the numerator and denominator of the Fraction class.
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator==0) {
            this.denominator=1;
        }
        else{
            this.denominator = denominator;
        }
    }

    //Constructor that takes a Fraction as the sole parameter and makes the Fraction equivalent to the inputted Fraction.
    public Fraction(Fraction in) {
        this.numerator = in.getNumerator();
        if (in.getDenominator()==0){
            this.denominator=1;
        }
        else {
            this.denominator = in.getDenominator();
        }
    }

//    Accessor method for numerator
    public int getNumerator() {
        return numerator;
    }
//Setter method for numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

//    Accessor method for denominator
    public int getDenominator() {
        return denominator;
    }
//Accessor method for denominator
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

//    Public override method that returns the numerator and denominator as a String
    @Override
    public String toString() {
        String string = new String();
        string = numerator + "/" + denominator;
        return string;
    }
//Public method that returns a boolean based on whether or not the numerators and denominators of the Fraction and a inputted Fraction are equivalent.
    public boolean equals(Fraction fraction) {
        return (fraction.getDenominator() == denominator && fraction.getNumerator() == numerator);
    }
//Public method that adds the Fraction by an inputted Fraction and outputs the Fraction that represents the result of the mathematical operation
public Fraction add(Fraction in) {
    int tempDenominator;
    int tempNumerator;
    tempDenominator = denominator * in.getDenominator();
    tempNumerator = in.getNumerator() * this.getDenominator() + numerator * in.getDenominator();
    Fraction tempFraction = new Fraction(tempNumerator, tempDenominator);
    tempFraction.toLowestForm();
    return tempFraction;
}
//Public method that subtracts the Fraction by an inputted Fraction and outputs the Fraction that represents the result of the mathematical operation
public Fraction subtract(Fraction in) {
    int tempDenominator;
    int tempNumerator;
    tempDenominator = denominator * in.getDenominator();
    tempNumerator = numerator * in.getDenominator() - in.getNumerator() * denominator;
    Fraction tempFraction = new Fraction(tempNumerator, tempDenominator);
    tempFraction.toLowestForm();
    return tempFraction;
}

//Public method that multiplies the Fraction by an inputted Fraction and outputs the Fraction that represents the result of the mathematical operation
public Fraction multiply(Fraction in) {
    int tempDenominator;
    int tempNumerator;
    tempDenominator = denominator * in.getDenominator();
    tempNumerator = in.getNumerator() *  numerator ;
    Fraction tempFraction = new Fraction(tempNumerator, tempDenominator);
    tempFraction.toLowestForm();
    return tempFraction;
}

//Public method that divides the Fraction by an inputted Fraction and outputs the Fraction that represents the result of the mathematical operation
public Fraction divide(Fraction in) {
    int tempDenominator;
    int tempNumerator;
    tempNumerator = numerator * in.getDenominator();
    tempDenominator = in.getNumerator() *  denominator ;
    Fraction tempFraction = new Fraction(tempNumerator, tempDenominator);
    tempFraction.toLowestForm();
    return tempFraction;
}
//

//Helper method used in toLowestForm to calculate the Greatest Common Divisor
    private int genGCD(int num1, int num2) {
        int i;
        while (Math.abs(num2) > 0) {
            i = num1 % num2;
            num1 = num2;
            num2 = i;
        }
        return num1;
    }

//Public method that converts the fraction to it's lowest form with whole numbers.
    public void toLowestForm() {
        int tempDenominator = denominator / genGCD(numerator, denominator);
        int tempNumerator = numerator / genGCD(numerator, denominator);
//        Fixes sign positioning of Fractions
        if (isNegative(tempDenominator)&& !isNegative(tempNumerator)){
            tempNumerator=tempNumerator*-1;
            tempDenominator=tempDenominator*-1;
        }
        else if (isNegative(tempDenominator)&& isNegative(tempNumerator)){
            tempNumerator=tempNumerator*-1;
            tempDenominator=tempDenominator*-1;
        }
        denominator=tempDenominator;
        numerator=tempNumerator;
    }

//Helper method used in toLowestForm to determine if a number is negative
    private boolean isNegative(int i) {
        String s = Integer.toString(i);
        return s.startsWith("-");
    }

}

