package Homework;

/**
 * Created by madmann on 10/25/16.
 */
public class Foo {
    private int numPeople;
    private Double[] lastRaise1 = new Double[numPeople];
    private Double[] lastRaise2 = new Double[numPeople];
    private Double[] lastRaise3 = new Double[numPeople];
    private Double[] lastRaise4 = new Double[numPeople];
    private Double[] lastRaise5 = new Double[numPeople];
    private int[] employeeNumber = new int[numPeople];
    private String[] dateHired = new String[numPeople];

    public static Double sumArray(Double[] in) {
        Double total = 0.0;

        for (int i = 0; i < in.length; i++) {
            total += in[0];
        }
        return total;

    }
    public static void switchThem(int[] in1, int[]in2) {
        if (in1.length<=in2.length){
            int[] tempArray = new int[in2.length];
            for (int i=0; i<in2.length;i++){
                tempArray[i]=in2[i];
                in2[i]=in1[i];
                in1[i]=tempArray[i];
            }
        }
        else {
            int[] tempArray = new int[in1.length];
            for (int i=0; i<in1.length;i++){
                tempArray[i]=in1[i];
                in1[i]=in2[i];
                in2[i]=tempArray[i];
            }
        }

    }
}
