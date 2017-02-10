//
//import java.awt.*;
//import java.io.*;
//import java.util.*;
//
////------------------------------------------------------
//
//public class sortTemp {
//    int quickSteps = 0;
//
//    public static void main(String[] args) {
//        final int SIZE = 200000;
//        //Integer temp= new Integer(0);
//        Integer[] temp = new Integer[SIZE + 1];
//        for (int x = 0; x < SIZE + 1; x++) {
//            temp[x] = new Integer(0);
//        }
//        sortTemp sort=new sortTemp();
//        sort.sortMenu(temp);
//    }
//
////------------------------------------------------------
//
//    public  void sortMenu(Integer[] temp) {
//        int choice;
//        Integer steps;
//        String print = "";
//        do {
//            System.out.println("Sorting algorithm menu");
//            System.out.println("(1) Bubble sort");
//            System.out.println("(2) Selection sort");
//            System.out.println("(3) Insertion sort");
//            System.out.println("(4) Recursive mergesort");
//            System.out.println("(5) Quicksort");
//            System.out.println("(6) Quit");
//            steps = 0;
//            choice = inputInt();
//
//            // is choice a valid option??
//            if ((choice >= 1) && (choice <= 5)) {
//                int tempNum = 0;
//                // valid option
//                temp = fillArray(temp);
//                if (choice == 1) {
//                    tempNum = bubbleSort(temp, steps);
//                } else if (choice == 2) {
//                    tempNum = selectionSort(temp, steps);
//                } else if (choice == 3) {
//                    tempNum = insertionSort(temp, steps);
//                } else if (choice == 4) {
//                    tempNum = mergeSort(temp, 1, temp.length, steps);
//                } else if (choice == 5) {
//                    quickSort(temp, 1, temp.length);
//                }
//
//                System.out.print("Print list to screen? ");
//                print = inputString();
//                if ((print.equals("y")) || (print.equals("Y"))) {
//                    screenOutput(temp);
//                    System.out.println(tempNum + " Steps Executed");
//                }
//
//                System.out.print("Hit return to continue");
//                print = inputString();
//            }
//        } while (choice != 6);
//    }
//
//
//
////------------------------------------------------------
//
//    public static Integer[] fillArray(Integer[] temp) {//This is now an array of integers, but they are stored in the
//        //Integer class.  So it is an array of class Integer.
//        //Has function, intValue, print, and setInteger!
//
//        int size;
//        System.out.print("How many numbers do you wish to generate: ");
//        int i = inputInt();
//        //System.out.println(i);
//        temp[0] = i;
//        System.out.println();
//        System.out.print("Largest integer to generate: ");
//        size = inputInt();
//        Random generator = new Random();
//        for (int loop = 1; loop <= i; loop++) {
//            temp[loop] = generator.nextInt(size) + 1;
//        }
//        return temp;
//
//    }
//
////------------------------------------------------------
//
//    public static void screenOutput(final Integer[] temp) {
//        //System.out.println(setiosflags(ios::right)<<endl;
//        for (int loop = 1; loop <= temp[0].intValue(); loop++) {
//            System.out.print(temp[loop]);
//            System.out.print(" ");
//            //	if(loop%12==0)
//            //		System.out.println();
//        }
//        System.out.println();
//    }
//
////------------------------------------------------------
//
//    public static void swap(Integer[] list, int a, int b) {
//        Integer temp = list[a];
//        list[a] = list[b];
//        list[b] = temp;
//
//    }
//
//
////------------------------------------------------------
//
//    public static int bubbleSort(Integer[] list, int steps) {
//        for (int outer = 1; outer <= list[0].intValue() - 1; outer++) {
//            for (int inner = 1; inner <= list[0].intValue() - outer; inner++) {
//
//                if (list[inner].intValue() > list[inner + 1].intValue()) {
//                    swap(list, inner, inner + 1);
//                    steps += 3;
//                }
//            }
//        }
//        return steps;
//    }
//
//
////------------------------------------------------------
//
//    public static int selectionSort(Integer[] list, int steps) {
//        int flag;
//        steps++;
//        for (int outer = 1; outer < list[0].intValue(); outer++) {
//            flag = outer;
//            steps++;
//            for (int inner = outer + 1; inner <= list[0].intValue(); inner++) {
//                if (list[inner].intValue() < list[flag].intValue()) {
//                    flag = inner;
//                    steps++;
//                }
//            }
//            swap(list, outer, flag);
//            steps += 3;
//
//        }
//        return steps;
//
//    }
//
////------------------------------------------------------
//
//    public static int insertionSort(Integer[] list, int steps) {
//        int outer, pos, temp;
//
//        for (outer = 2; outer <= list[0].intValue(); outer++) {
//            pos = outer;
//            temp = list[pos].intValue();
//            while ((pos > 1) && (list[pos - 1].intValue() > temp)) {
//                list[pos] = list[pos - 1].intValue();
//                pos--;
//                steps++;
//            }
//            list[pos] = temp;
//        }
//        return steps;
//    }
//
//    //------------------------------------------------------
////
//    public static int mergeSort(Integer[] list, int first, int last, int steps) {
////        steps += 2;
////        if (first == last) {
////            //one value, no code
////        } else if (first + 1 == last) {
////            steps++;
////            if (list[last] < list[first]) {
////                swap(list,last,first);
////                steps++;
////            }
////        }
////        else {
////            int midd=(first+last)/2;
////            steps++;
////            mergeSort(list,first,midd,steps);
////            mergeSort(list, midd+1, last, steps);
////            steps+=merge(list, first, midd, last,steps);
////        }
//        return steps;
//    }
////
////    public static int merge (Integer[]A, int first, int mid, int last,int steps){
////        Integer[] temp=new Integer[A[0]];
////        int posA=first;
////        int end=last-first+1;
////        int posB=mid+1;
////        int posC=first;
////        boolean aDone=false;
////        boolean bDone=false;
////        temp[0]=A[0];
////        steps+=9;
////
////
////
////
////
////        for (int i=1;i<=end; i++){
////            steps+=3;
////            if(aDone){
////                temp[posC]=A[posB];
////                posB++;
////                steps+=2;
////            }
////            else if(bDone){
////                temp[posC]=A[posA];
////                posA++;
////                steps+=2;
////            }
////            else if (A[posA]<A[posB]){
////                temp[posC]=A[posA];
////                posA++;
////                steps+=2;
////            }
////            else {
////                temp[posC]=A[posB];
////                posB++;
////                steps+=2;
////            }
////            steps++;
////            if (posA<mid){
////                aDone=true;
////                steps++;
////            }
////            else if (posB<last){
////                bDone=true;
////                steps++;
////            }
////            posC++;
////            steps++;
////        }
////        steps++;
////        for(int loop=first;loop<=last;loop++){
////            A[loop]=temp[loop];
////            steps+=3;
////        }
////        return steps;
////
////    }
//
//
////------------------------------------------------------
//
//    public void quickSort(Integer[] list, int first, int last) {
//        last=last-1;
//        if (last > first) {
//            int pivotIndex = partition(list, first, last);
//            quickSteps++;
//            quickSort(list, first, pivotIndex - 1);
//            quickSteps++;
//            quickSort(list, pivotIndex + 1, last);
//            quickSteps++;
//        }
//        System.out.println(quickSteps);
//    }
//
//    public int partition(Integer[] list, int first, int last) {
//        int pivot = list[first];
//        quickSteps++;
//// Chose the first element as the pivot
//        int low = first + 1;
//        quickSteps++;
//// Index for forward search
//        int high = last;
//        quickSteps++;
//// Index for backwards search
//        while (high > low) {
//            // Search forward from left
//            while (low <= high && list[low] <= pivot) {
//                low++;
//                quickSteps++;
//
//            }
//            // Search backward from right
//            while (low <= high && list[high] > pivot) {
//                high--;
//                quickSteps++;
//
//            }
//            // Swap two elements in the list
//            if (high > low) {
//                int temp = list[high];
//                quickSteps++;
//
//                list[high] = list[low];
//                quickSteps++;
//
//                list[low] = temp;
//                quickSteps++;
//
//            }
//        }
//        while (high > first && list[high] >= pivot)
//            high--;
//
//// Swap pivot with list[high]
//        if (pivot > list[high]) {
//            list[first] = list[high];
//            list[high] = pivot;
//            return high;
//        } else {
//            return first;
//        }
//    }
//
//
////------------------------------------------------------
//
//
//    public static int inputInt() {
//        String inp;
//        try {
//            BufferedReader buff = new
//                    BufferedReader(new InputStreamReader(System.in));
//            inp = buff.readLine();
//        } catch (IOException e) {
//            inp = "0";
//        }
//        int i = Integer.parseInt(inp);
//        return i;
//    }
//
////------------------------------------------------------
//
//    public static String inputString() {
//        String inp;
//        try {
//            BufferedReader buff = new
//                    BufferedReader(new InputStreamReader(System.in));
//            inp = buff.readLine();
//        } catch (IOException e) {
//            inp = "";
//        }
//
//        return inp;
//    }
//
//}
