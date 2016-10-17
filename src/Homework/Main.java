package Homework;

/**
 * Created by madmann on 9/28/16.
 */
public class Main {


    public static void main(String[] args) {
        System.out.println( samba(5));
    }

    public static int samba(int n) {
        int temp=1;
        for (int k=n; k>1;k--){
            temp*=k;
        }
        return temp;
       }
}


