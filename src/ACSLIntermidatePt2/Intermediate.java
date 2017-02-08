package ACSLIntermidatePt2;

import java.util.Scanner;

/**
 * Created by madmann on 2/8/17.
 */
public class Intermediate {
        public static void main(String[] args) {
            System.out.println("Enter String:");
            String original = new Scanner(System.in).next();
            int[] result = new int[original.length()];
            int count = 1;
            int count2 = 0;
            result[0] = Integer.parseInt(original.substring(1, 1 + Integer.parseInt(String.valueOf(original.charAt(0)))));
            for (int i = original.length() - 1; i > 1; i--) {
                int check = 0;
                for (int e : result) if (e > check) check = e;
                String next;
                if (i - count2 >= 1) next = String.valueOf(original.charAt(i - count2));
                else next = String.valueOf(original.charAt(i));
                while (check >= Integer.parseInt(next)) {
                    if (i - count <= 1) break;
                    next += String.valueOf(original.charAt(i - count));
                    count2++; count++;
                }
                if (Integer.parseInt(next) > check) result[result.length - i] = Integer.parseInt(next);
            }
            for (int e : result) if (e != 0) System.out.printf("%d ", e);
        }
    }

