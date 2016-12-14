import java.util.Scanner;
import java.lang.String;
/*
 * Hassaan Mastoor
 * 12/13/16
 * Period: 2
 */
public class ACSLAGRAM2 {
    public static void main (String [] args){
        String leadCard;
        String card1;
        String card2;
        String card3;
        String card4;
        String card5;
        int CLUBS=0;
        int DIAMOND=1;
        int HEARTS=2;
        int SPADES=3;
        int start = 1;
        int oneDiamond = 1;
        int twoDiamond = 2;
        int threeDiamond = 3;
        int fourDiamond = 4;
        int fiveDiamond = 5;
        int sixDiamond = 6;
        int sevenDiamond = 7;
        int eightDiamond = 8;
        int nineDiamond = 9;
        int tenDiamond = 10;
        int jackDiamond = 11;
        int queenDiamond = 12;
        int kingDiamond = 13;
        int aceDiamond = 0;
        Scanner input = new Scanner (System.in);

        System.out.println("-Each line of input will contain the opponent's lead card and the 5 cards held by the dealer.");
        System.out.println("-All cards will be represented by 2-character strings in value-suit order. AH represents te ace of hearts. K, Q, J, T will be used for king, queen, jack, and 10 respectively.");
        System.out.println("-Note that the ace in this game has the lowest rank.");
        System.out.println("Enter your cards in the format of card number (A,1,2,3,4,5,6,7,8,9,10, Jack, Queen, King and then the suit (Diamonds, Clubs, Spades, Hearts");

        System.out.print("Enter your lead card: ");
        leadCard = input.nextLine();
        System.out.print("Enter your first card: ");
        card1 = input.nextLine();
        System.out.print("Enter your second card: ");
        card2 = input.nextLine();
        System.out.print("Enter your third card: ");
        card3 = input.nextLine();
        System.out.print("Enter your fourth card: ");
        card4 = input.nextLine();
        System.out.print("Enter your fifth card: ");
        card5 = input.nextLine();
        input.close();

        System.out.println("Your cards are " +leadCard +", " +card1 +", " +card2 +", " +card3 +", " +card4 +", " +card5);

        if (leadCard.substring(1)==card1.substring(1) || leadCard.substring(1)==card2.substring(1) || leadCard.substring(1)==card3.substring(1) || leadCard.substring(1)==card4.substring(1) || leadCard.substring(1)==card5.substring(1)){
            if (leadCard.substring(1)==card1.substring(1) && leadCard.compareTo(card1)<0) {
                if (card1.substring(1)==card2.substring(1) && card1.compareTo(card2)<0)
                    if (card1.substring(1)==card3.substring(1) && card1.compareTo(card3)<0)
                        if (card1.substring(1)==card4.substring(1) && card1.compareTo(card4)<0)
                            if (card1.substring(1)==card5.substring(1) && card1.compareTo(card5)<0){
                                System.out.println(card1);
                            }

            }
        }
    }
}