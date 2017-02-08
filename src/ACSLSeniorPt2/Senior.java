package ACSLSeniorPt2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by madmann on 2/8/17.
 */
public class Senior {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String original=new Scanner(System.in).next();
        for (char e : original.toCharArray()) arrayList.add(String.valueOf(e));
        System.out.println("Enter String:");
        int[] result = new int[arrayList.size()];
        result[0] = Integer.parseInt(original.substring(1, 1 + Integer.parseInt((arrayList.get(0)))));
        boolean left = true;
        for (int i = 0; i < result.length; i++){
            int check = 0;
            for (int e : result) if (e > check) check = e;
            String next = "";
            if (left) {
                next = arrayList.get(0);
                for (int e = 0; e < result.length; e++) {
                    while (Integer.parseInt(next) <= check) {
                        arrayList.remove(0);

                        next += arrayList.get(0);
                    }
                        System.out.printf(" %s", next);

                }
                left = false;
            } else {
                next = arrayList.get(arrayList.size() - 1);
                    for (int e = 0; e < result.length; e++) {
                        arrayList.remove(arrayList.size() - 1);
                        if (arrayList.size()!=0) {
                            if (Integer.parseInt(next) <= check) {
                                next += arrayList.get(arrayList.size() - 1);
                            } else {
                                System.out.printf(" %s", next);
                            }
                        }
                    }
                left=true;
            }
            }
        }
    }


