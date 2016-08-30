package MannBasic.ReviewPrograms.ThreeNumAverage;

import java.util.Scanner;

/**
 * Created by madmann on 8/30/16.
 */
public class Main {
    public static void main(String[] args ){
        System.out.printf("Enter first number: %n");
        Scanner scanner= new Scanner(System.in);
        Double num1= scanner.nextDouble();
        System.out.printf("Enter second number: %n");
        Double num2= scanner.nextDouble();
        System.out.printf("Enter third number: %n");
        Double num3= scanner.nextDouble();
        Double total= num1+num2+num3;
        double result = total / 3;
        System.out.printf("The average is %s", result );
    }
}
