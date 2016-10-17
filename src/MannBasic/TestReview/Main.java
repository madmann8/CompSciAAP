package MannBasic.TestReview;

/**
 * Created by madmann on 9/29/16.
 */
public class Main {
    public static void main(String[] args){
       int count=5;
        for (int p=0;p<7;p++){
            if (p%3==0) count--;
            else count++;
        }
        System.out.println(count);
    }
}
