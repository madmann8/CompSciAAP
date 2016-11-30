package Homework;

/**
 * Created by madmann on 9/28/16.
 */
public class Main {
    public static void swap(int[] l1, int[] l2) {
        int[] l3=l1;
        l1=l2;
        l2=l3;
    }

    public static void main(String[] args) {
        int[] list1= {56,23,78,54,11,95,60,17,64};
        int[] list2= {32,44,87,11,90,56};
        swap(list1,list2);
        for (int item1:list1)
            System.out.printf(item1+"");
        System.out.println("");
        for (int item1:list2)
            System.out.printf(item1+"");
        System.out.println(list2.toString());

    }
}



