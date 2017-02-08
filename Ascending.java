package HassaanStuff

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner (System.in);
    	
    	for (int i= 1; i<=5 ; i++) {	
    		
        System.out.println("Please input a digit of 2 to 20 digits long: ");
        String istr = input.nextLine();
        char t = istr.charAt(0);
        int len = t - '0';        
        //System.out.println(len);       
        String s = istr.substring(1, len+1);
        //System.out.println(s);
        int pre_num = Integer.valueOf(s);
        //System.out.println(pre_num);
        String rstr = new StringBuilder(istr.substring(len+1)).reverse().toString();
        //System.out.println(rstr);
        System.out.print(pre_num + " ");

        int cur_num = 0;
        len = 1;
        int loc = 0;

        while (cur_num <= pre_num && loc+len < rstr.length() || loc+len == rstr.length()) {
            String substr = rstr.substring(loc, loc+len);
            //System.out.println(substr);
            cur_num = Integer.valueOf(substr);
            //System.out.println(cur_num);
            if (cur_num > pre_num) {
                System.out.print(cur_num + " ");
                pre_num = cur_num;
                //System.out.println(cur_num);
                //System.out.println(pre_num);
                cur_num = 0;
                loc += len;
                //System.out.println(loc);
                len = 1;
            } else {
                len++;
            }
        }
        System.out.println("\n");
        }

    	input.close();
    }
}

