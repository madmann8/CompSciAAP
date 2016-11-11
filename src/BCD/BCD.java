package BCD;

import com.sun.tools.javac.*;
import com.sun.tools.javac.util.ArrayUtils;

import java.text.DecimalFormat;

/**
 * Created by madmann on 10/27/16.
 */
public class BCD {
    private Integer[] digit;

    public BCD(Integer[] digit) {
        for (Integer i = digit.length-1; i >=0; i--) {
            if ((Integer) digit[i] != null) {
                addADidgit(digit[i]);
            }
        }
    }

    public BCD(Integer digits) {

        char[] chars = ("" + digits).toCharArray();
        Integer[] nums = new Integer[chars.length];
        for (Integer i = chars.length - 1; i >= 0; i--) {
            nums[nums.length - i - 1] = Integer.parseInt(Character.toString(chars[i]));
        }
        digit = nums;
    }

    public Integer numberOfDigits(Integer n) {
        return digit.length;
    }


    public Integer nthDigit(Integer n) {
        if (!(n >= digit.length)) return digit[n];
        else return null;
    }

    public void print() {
        for (int e = digit.length - 1; e >= 0; e--) {
            if (e % 3 == 2 && e != digit.length - 1 && e != 1 && e != 0)
                System.out.printf("," + digit[e]);
            else if (digit[e] != null) System.out.printf("" + digit[e]);
        }
    }


    public void addADidgit(Integer newDigit) {
        digit = increaseSize(digit);
        digit[digit.length - 1] = newDigit;
    }


    private static Integer[] increaseSize(Integer[] in) {
        Integer[] tempArray;
        if (in != null) {
            tempArray = in.clone();
            in = new Integer[in.length + 1];
        } else {
            tempArray = new Integer[1];
            in = new Integer[1];
        }
        System.arraycopy(tempArray, 0, in, 0, tempArray.length);
        return in;
    }


    public BCD addBCD(BCD inBCD) {
        boolean isDone = false;
        Integer length = 0;
        for (Integer i = 0; i < 323224; i++) {
            if (
                    (inBCD.nthDigit(i) == null) && this.nthDigit(i) == null && isDone == false) {
                length = i;
                isDone = true;
            }
        }
        Integer[] result = new Integer[length];
        Integer tempNum = 0;
        for (Integer i = 0; i < length; i++) {
            Integer sum1 = 0;
            if (inBCD.nthDigit(i) == null && nthDigit(i) == null) {
                sum1 = tempNum;
            } else if (inBCD.nthDigit(i) == null) {
                sum1 = nthDigit(i) + tempNum;
            } else if (nthDigit(i) == null) {
                sum1 = inBCD.nthDigit(i) + tempNum;
            } else {
                sum1 = inBCD.nthDigit(i) + nthDigit(i) + tempNum;
            }
            Integer remainder1 = sum1 % 10;
            tempNum = sum1 / 10;
            result[i] = remainder1;
        }
        return new BCD(result);


    }


/*

    public BCD multiplyBCD(int num) {
        BCD tempBCD=new BCD(0);
        BCD tempBCD2=new BCD(0);
        for (int i=0;i<num;i++){
          tempBCD2=tempBCD2.addBCD(this);
        }
        return tempBCD2;
    }

    public BCD multiplyByTen() {
        BCD tempBCD=this.multiplyBCD(10);
        return tempBCD;
    }

    public BCD multiplyBCDs(BCD other){
        BCD tempBCD=new BCD(0);
        int digit=0;
        do {
            tempBCD=tempBCD.addBCD(other.multiplyBCD(this.digit[digit]));
            other=other.multiplyByTen();
            digit++;
        } while (digit<this.digit.length);
        return tempBCD;
    }
*/



/*
    public void trimZeros() {
        boolean isZero=false;
        int firstNonZero=0;
        for (int i = 0; i < digit.length; i++){
            for (int e=i;e<=0;e--){
                if (digit[e]!=0){
                    isZero=false;
                }
                 else if(e==0&&digit[e]==0){
                    isZero=true;
                }
            }
            if (isZero){
                firstNonZero=i+1;
                break;
            }
        }
        int copyStart = firstNonZero; //TODO Implement this internal method
        int trimmedLength = this.digit.length - copyStart;
        int[] trimmed;
        System.arraycopy(this.digit, copyStart, trimmed, 0, trimmedLength);
        this.digit = trimmed;

    }



*/








/*

    private static Integer[] trim (Integer[] in){
        Integer nullMaker=0;
        Boolean hasMarked=false;
        for (Integer i=0;i<in.length;i++){
            if ((Integer) in[i] ==null && (!(hasMarked))){
                nullMaker=i;
                hasMarked=true;
            }
        }
        Integer[] results= new Integer[nullMaker+1];
        for (Integer i=0;i<=nullMaker;i++){
            results[i]= in[i];
        }
        return results;
    }
*/

}
