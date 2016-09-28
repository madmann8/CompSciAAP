package Homework;

/**
 * Created by madmann on 9/28/16.
 */
public class Main {
    public static void main (String[] args){
        Code code= new Code("1234");
        System.out.println(code.getCode());
        code.hide(1,3);
        System.out.println(code.getCode());
        code.recover(1,2);
        System.out.println(code.getCode());

    }
}
