package ACSLSeniorPt2;

import java.util.ArrayList;
import java.util.Scanner;

public class Senior {
    public static void main(String[] args) {
        for (int f = 0; f < 100; f++) {
            System.out.println("Enter String:");
            ArrayList<String> arrayList = new ArrayList();
            String original = new Scanner(System.in).next();
            int[] result = new int[original.length()];
            for (char e : original.toCharArray()) arrayList.add(String.valueOf(e));
            boolean left = true;
            int i = 0;
            while (!arrayList.isEmpty() && i <= 100) {
                int check = 0;
                for (int e : result) if (e > check) check = e;
                String next = "";
                if (left) {
                    if (arrayList.size() > 2) {
                        next = arrayList.get(0);
                        while (Integer.parseInt(next) <= check) {
                            arrayList.remove(0);
                            next += arrayList.get(0);
                        }
                        arrayList.remove(0);
                    }

                    left = false;
                } else {
                    next = arrayList.get(arrayList.size() - 1);
                    if (arrayList.size() > 2) {
                        while (Integer.parseInt(next) <= check) {
                            arrayList.remove(arrayList.size() - 1);
                            next += arrayList.get(arrayList.size() - 1);
                        }
                        arrayList.remove(arrayList.size() - 1);

                    }
                    left = true;
                }
                if (next != "" && i < result.length && (Integer.parseInt(next) > check))
                    result[i] = Integer.parseInt(next);
                i++;
            }
            for (int e : result) {
                if (e != 0) {
                    System.out.printf("%d ", e);
                }
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }
}