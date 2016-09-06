package MannBasic.ReviewPrograms.MultiplicationTable;

/**
 * Created by madmann on 9/1/16.
 */
public class Main {
    public static void main(String[] arg){
        int i;
        for (i=1; i<13;i++){
            int e;
            for (e=1; e<13;e++){
                int result= i*e;
                if (e<12) {
                    System.out.printf("%d      ", result);
                }
                if (e==12){
                    System.out.printf("%d      %n", result);
                }
            }
        }
    }
}
