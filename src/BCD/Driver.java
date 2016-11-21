package BCD;

/**
 * Created by madmann on 10/25/16.
 */
public class Driver {
    public static void main(String[] args) {
        BCD bcd1=new BCD(2);
        System.out.println("6.805647338E38:");
        bcd1.pow(129).print();
        BCD bcd2=new BCD(19);
        System.out.println("1.009182377E78:");
        bcd2.pow(61).print();
        System.out.println("4274883284060025564298013753389399649690343788366813724672000000000000:");
        BCD.factorial(53).print();
        System.out.println("1081396758240290900504101305800329649720646107774902579144176636573226531909905153326984536526808240339776398934872029657993872907813436816097280000000000000000000000000:");
        BCD.factorial(105).print();


        int[] nums3={0};
        System.out.println("0:");
        BCD bcd3=new BCD(nums3);
        bcd3.print();
        BCD bcd31=new BCD(0);
        System.out.println("0:");
        bcd31.print();
        System.out.println("1:");
        System.out.println(bcd3.numberOfDigits());
        System.out.println("0:");
        System.out.println(bcd3.nthDigit(0));



        int[] nums4={5};
        System.out.println("5:");
        BCD bcd4=new BCD(nums4);
        bcd4.print();
        System.out.println("5:");
        BCD bcd41=new BCD(5);
        bcd41.print();
        System.out.println("1:");
        System.out.println(bcd4.numberOfDigits());
        System.out.println("5:");
        System.out.println(bcd4.nthDigit(0));



        int[] nums5={7,9};
        System.out.println("97:");
        BCD bcd5=new BCD(nums5);
        bcd5.print();
        BCD bcd51=new BCD(97);
        System.out.println("97:");
        bcd51.print();



        int[] nums6={2,5,4,2};
        System.out.print("2452:");
        BCD bcd6=new BCD(nums6);
        bcd6.print();
        BCD bcd61=new BCD(2452);
        System.out.print("2452:");
        bcd61.print();
        System.out.println("4:");
        System.out.println(bcd6.numberOfDigits());
        System.out.println("5:");
        System.out.println(bcd6.nthDigit(3));



        int[] nums7={5,4,2,5,8,2};
        System.out.println("285245:");
        BCD bcd7=new BCD(nums7);
        bcd7.print();
        BCD bcd71=new BCD(285245);
        bcd71.print();



        int[] nums8={4,9,5,6,2,7,4};
        System.out.println("4726594:");
        BCD bcd8=new BCD(nums8);
        bcd8.print();
        BCD bcd81=new BCD(4726594);
        bcd81.print();



        System.out.println("0:");
        bcd3.addBCDs(bcd31).print();
        System.out.println("5,011,839:");
        bcd8.addBCDs(bcd7).print();
        System.out.println("4726594:");
        bcd81.addBCDs(bcd3).print();

        System.out.println("0:");
        bcd3.multiplyBy(23312).print();

        System.out.println("0:");
        bcd8.multiplyBy(0).print();
        System.out.println("");





        System.out.println("23312:");
        bcd8.multiplyBy(1).print();

        System.out.println("233,120:");
        bcd8.multiplyBy(10);

        System.out.println("45,106,551:");
        bcd8.addBCDs(bcd7).multiplyBy(9);

        System.out.println("699,420,740:");
        bcd6.multiplyBCDs(bcd7).print();

        System.out.println("95:");
        bcd4.multiplyBCDs(bcd2).print();


        System.out.println("10:");
        bcd1.multiplyBCDs(bcd4).print();

        System.out.println("0");
        bcd3.multiplyBCDs(bcd8).print();

        System.out.println("4,285,122,345:");
        bcd6.multiplyBCDs(bcd7).multiplyBCDs( bcd4.multiplyBCDs(bcd2)).print();






    }
}





