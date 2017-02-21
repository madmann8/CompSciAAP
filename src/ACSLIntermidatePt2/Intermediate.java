//package ACSLIntermidatePt2;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Intermediate {
//    public static void main(String[] args) {
//        for (int f = 0; f < 100; f++) {
//            System.out.println("Enter String:");
//            ArrayList<String> arrayList = new ArrayList<>();
//            String original = new Scanner(System.in).next();
//            int[] result = new int[original.length()];
//            for (char e : original.toCharArray()) arrayList.add(String.valueOf(e));
//            int length = Integer.valueOf(arrayList.get(0));
//            arrayList.remove(0);
//            String firstString = "";
//            for (int i = 1; i <= length; i++) {
//                firstString += arrayList.get(0);
//                arrayList.remove(0);
//            }
//            result[0] = Integer.valueOf(firstString);
//            boolean left = true;
//            int i = 1;
//            while (!arrayList.isEmpty() && i <= 100) {
//                int check = 0;
//                for (int e : result) if (e > check) check = e;
//                String next = "";
//                next = arrayList.get(arrayList.size() - 1);
//                boolean toBig = false;
//                if (arrayList.size() > 2) {
//                    while (Integer.parseInt(next) <= check || next.length() < length) {
//                        if (arrayList.size() - 2 < 0) {
//                            toBig = true;
//                            break;
//                        }
//                        arrayList.remove(arrayList.size() - 1);
//                        next += arrayList.get(arrayList.size() - 1);
//                    }
//                    if (!toBig) arrayList.remove(arrayList.size() - 1);
//
//                }
//
//                if (next != "" && i < result.length && (Integer.parseInt(next) > check))
//                    result[i] = Integer.parseInt(next);
//                i++;
//            }
//            for (int e : result) {
//                if (e != 0) {
//                    System.out.printf("%d ", e);
//                }
//            }
//            System.out.println("");
//            System.out.println("");
//            System.out.println("");
//        }
//    }
//}