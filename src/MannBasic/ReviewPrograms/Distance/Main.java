package MannBasic.ReviewPrograms.Distance;

import java.util.Scanner;

/**
 * Created by madmann on 8/30/16.
 */
public class Main {
    public static void main(String[] args){
        System.out.printf("Enter x1 : %n");
        Scanner scanner= new Scanner(System.in);
        Double x1= scanner.nextDouble();
        System.out.printf("Enter y1 number: %n");
        Double y1= scanner.nextDouble();
        System.out.printf("Enter x2 number: %n");
        Double x2= scanner.nextDouble();
        System.out.printf("Enter y2 number: %n");
        Double y2= scanner.nextDouble();
        Double result= Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        System.out.println(result);
    }
}
