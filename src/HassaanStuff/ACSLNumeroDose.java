package HassaanStuff;

import java.util.Scanner;

public class ACSLNumeroDose {
    public static void main(String[] args) {
        System.out.println("HAAASSSSAAANNN Custom Text:");
        Scanner scanner = new Scanner(System.in);
        String original = scanner.next();
        scanner.close();
        int[] printArray = new int[original.length()];
        int num1 = 1;
        int num2 = 0;
        String pos1;
        pos1 = String.valueOf(original.charAt(0));
        printArray[0] = Integer.valueOf(original.substring(1, 1 + Integer.valueOf(pos1)));
        for (int i = original.length() - 1; i > 1; i--) {
            int compare = 0;
            for (int e : printArray) {
                if (e > compare) {
                    compare = e;
                }
            }
            String next = "";
            if (i - num2 >= 1) next = String.valueOf(original.charAt(i - num2));
            else next = String.valueOf(original.charAt(i));
            while (compare >= Integer.valueOf(next)) {
                if (i - num1 <= 1) {
                    break;
                } else {
                    next += String.valueOf(original.charAt(i - num1));
                    num2++;
                    num1++;
                }
            }
            if (Integer.valueOf(next) > compare) {
                printArray[printArray.length - i] = Integer.valueOf(next);
            }
        }
        for (int num = 0; num < printArray.length; num++)
            if (num != 0) {
                System.out.print(num);
                System.out.print(" ");
            }
    }
}