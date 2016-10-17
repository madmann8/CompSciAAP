package ObjectNotes;

import sun.util.cldr.CLDRLocaleDataMetaInfo;

/**
 * Created by madmann on 10/4/16.
 */
public class ClockDriver {
    public static void main (String [] args){
        Clock ck1= new Clock();
        System.out.println(ck1.getDiff());
        System.out.println(ck1.isTicking());
        System.out.println(ck1.getHours());
    }
}
