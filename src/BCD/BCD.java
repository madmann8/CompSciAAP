package BCD;

/**
Created by Luke Mann on 10/27/16


 A class that represents a Binary Coded Decimal by storing the digits of a number in an array. Can be used to manipulate the BCD (addADigit, retrieve nthDigits, etc.)
 It can also be used to preform large number mathematical operations such as multiplying two BCDs, calculating factorials, and  raising BCDs to a specified number.
 The print method can be used to print the BCD in a comma separated form
 */
public class BCD {
    //    Array that holds the digits of the BCD
    private int[] digit;

    //    Initializer that takes array of numbers in inverse order
    public BCD(int[] bcdDigits) {
        for (int bcdDigit : bcdDigits) {
//            Adds to array as long as the number is not null
            if (bcdDigit != -1) {
                addADigit(bcdDigit);
            }
        }
    }

    //    Initializer that takes int that is converted to a BCD
    public BCD(Integer digits) {
//        Converts int to char array
        char[] chars = ("" + digits).toCharArray();
        int[] nums = new int[chars.length];
//        Parses char array for the digits then adds them to digits
        for (Integer i = chars.length - 1; i >= 0; i--) {
            nums[nums.length - i - 1] = Integer.parseInt(Character.toString(chars[i]));
        }
        digit = nums;
    }

    //    Returns an int containing the number of digits in the BCD
    public int numberOfDigits() {
        if (digit != null)
            return digit.length;
        else return 0;
    }

    //    Returns int representing the nth digit of an array in inverse order (ex. is BCD is 123, nthDigit(2) is one)
    public Integer nthDigit(int n) {
        if (!(n >= numberOfDigits())) return digit[n];
//        This is used to represent null as ints cannot be null
        else return 99;
    }

    //    Prints BCD in comma separated from
    public void print() {
        for (int e = digit.length - 1; e >= 0; e--) {
            if (e % 3 == 2 && e != digit.length - 1 && e != 1 && e != 0)
                System.out.printf("," + digit[e]);
            else if (digit[e] != -1) System.out.printf("" + digit[e]);
        }
        System.out.println("");
    }

    //    Adds a digit to left most number in BCD (ex. is BCD is 123, addADigit(1) is 1123)
    public void addADigit(Integer newDigit) {
//        Shifts all numbers over by one
        digit = increaseSize(digit);
        digit[digit.length - 1] = newDigit;
    }

    //    Helper method to increase size of digit for use in addADigit
    private static int[] increaseSize(int[] in) {
        int[] tempArray;
        if (in != null) {
            tempArray = in.clone();
            in = new int[in.length + 1];
        } else {
//            Creates array of one if array passed in is empty
            tempArray = new int[1];
            in = new int[1];
        }
//
        System.arraycopy(tempArray, 0, in, 0, tempArray.length);
        return in;
    }

    //    Method to add two BCDs together and returns new BCD that represents the sum
    public BCD addBCDs(BCD inBCD) {
        BCD result = new BCD(0);
//        Length is equivalent to the length of which ever BCD id longer
        int length;
        if (numberOfDigits() >= inBCD.numberOfDigits()) {
            length = numberOfDigits();
        } else {
            length = inBCD.numberOfDigits();
        }
//        tempNum is used to hold digits to be put in the next level digit
        int tempNum = 0;
        for (int i = 0; i < length; i++) {
            int sum1;
//            If the nthDigit is 99, the number does not exist
            if (inBCD.nthDigit(i) == 99 && nthDigit(i) == 99) {
                sum1 = tempNum;
            } else if (inBCD.nthDigit(i) == 99) {
                sum1 = nthDigit(i) + tempNum;
            } else if (nthDigit(i) == 99) {
                sum1 = inBCD.nthDigit(i) + tempNum;
            } else {
                sum1 = inBCD.nthDigit(i) + nthDigit(i) + tempNum;
            }
            tempNum = sum1 / 10;
            sum1 = sum1 % 10;
//           Sum1 now represents the left over to be added to the BCD sum
            if (i == 0) {
                result.digit[0] = sum1;
            } else {
                result.addADigit(sum1);
            }
        }
        if (tempNum != 0) {
            result.addADigit(tempNum);
        }
        return result;
    }

    //    Multiplies the BCD by an int and returns a BCD representing the product
    public BCD multiplyBy(int num) {
        BCD tempBCD2 = new BCD(0);
//        Add original to copy of BCD the number of times that it is being multiplied by
        for (int i = 0; i < num; i++) {
            tempBCD2 = tempBCD2.addBCDs(this);
        }
        return tempBCD2;
    }

    //    Multiplies the BCD by 10 and returns a BCD representing the product
    public BCD multiplyByTen() {
        return this.multiplyBy(10);
    }

    //   Multiplies the BCD by a BCD and returns a BCD representing the product
    public BCD multiplyBCDs(BCD tempBCD2) {
        BCD tempBCD = new BCD(0);
        for (int i = 0; i < this.numberOfDigits(); i++) {
            tempBCD = tempBCD.addBCDs(tempBCD2.multiplyBy(nthDigit(i)));
            tempBCD2 = tempBCD2.multiplyByTen();
        }
        return tempBCD;
    }

    //    Reruns a BCD repenting the factorial of an inputted int
    public static BCD factorial(int num) {
        if (num == 1) {
            return new BCD(1);
        }
//        Uses recursion to calculate factorials
        BCD input = new BCD(num);
        return input.multiplyBCDs(BCD.factorial(num - 1));
    }

    //    Returns a BCD repenting the BCD raised to the power of an inputted int
    public BCD pow(int num) {
        if (num == 0) {
            return new BCD(1);
        } else if (num == 1) {
            return new BCD(digit);
        }
//        Multiplies original by copy of BCD the power that it is being raised to
        BCD temp = new BCD(digit);
        BCD result = new BCD(digit);
        for (int i = 0; i < num - 1; i++) {
            result = result.multiplyBCDs(temp);
        }
        return result;
    }
}

