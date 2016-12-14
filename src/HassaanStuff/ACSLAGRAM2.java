package HassaanStuff;

import java.util.Scanner;
import java.lang.String;

/*
 * Hassaan Mastoor
 * 12/13/16
 * Period: 2
 */
public class ACSLAGRAM2 {
    public static int getIntRepresenationofValue(String input) {
        if (input.toCharArray()[0] == ('A')) {
            return 1;
        }
        if (input.toCharArray()[0] == ('2')) {
            return 2;
        }
        if (input.toCharArray()[0] == ('3')) {
            return 3;
        }
        if (input.toCharArray()[0] == ('4')) {
            return 4;
        }
        if (input.toCharArray()[0] == ('5')) {
            return 5;
        }
        if (input.toCharArray()[0] == ('6')) {
            return 6;
        }
        if (input.toCharArray()[0] == ('7')) {
            return 7;
        }
        if (input.toCharArray()[0] == ('8')) {
            return 8;
        }
        if (input.toCharArray()[0] == ('9')) {
            return 9;
        }
        if (input.toCharArray()[0] == ('T')) {
            return 10;
        }
        if (input.toCharArray()[0] == ('J')) {
            return 11;
        }
        if (input.toCharArray()[0] == ('Q')) {
            return 12;
        }
        if (input.toCharArray()[0] == ('K')) {
            return 13;
        } else return 0;

    }


    public static String getStringRepresenationofValue(int input) {
        if (input == (1)) {
            return "A";
        }
        if (input == (2)) {
            return "2";
        }
        if (input == (3)) {
            return "3";
        }
        if (input == (4)) {
            return "4";
        }
        if (input == (5)) {
            return "5";
        }
        if (input == (6)) {
            return "6";
        }
        if (input == (7)) {
            return "7";
        }
        if (input == (8)) {
            return "8";
        }
        if (input == (9)) {
            return "9";
        }
        if (input == (10)) {
            return "T";
        }
        if (input == (11)) {
            return "J";
        }
        if (input == (12)) {
            return "Q";
        }
        if (input == (13)) {
            return "K";
        } else return ":(";

    }

    private static boolean findBetterCard(String leadCardSuit, int leadCardValue, String inputCardSuit1, int inputCardValue1, String inputCardSuit2, int inputCardValue2) {
        if (inputCardSuit1.equals(leadCardSuit) && inputCardSuit2.equals(leadCardSuit)) {
            if (!(inputCardValue1 <= leadCardValue && inputCardValue2 <= leadCardValue)) {
                if (inputCardValue1 > leadCardValue && (!(inputCardValue2 > leadCardValue))) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (inputCardValue1 < inputCardValue2) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (inputCardSuit1.equals(leadCardSuit)) {
            return true;
        }
        if (inputCardSuit2.equals(leadCardSuit)) {
            return false;
        }
        if (inputCardValue1 < inputCardValue2) {
            return true;
        } else if (inputCardValue1> inputCardValue2) {
            return false;
        } else {
            System.out.println(":(");
            return true;
        }
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("-Each line of input will contain the opponent's lead card and the 5 cards held by the dealer.");
        System.out.println("-All cards will be represented by 2-character strings in value-suit order. AH represents te ace of hearts. K, Q, J, T will be used for king, queen, jack, and 10 respectively.");
        System.out.println("-Note that the ace in this game has the lowest rank.");
        System.out.println("Enter your cards in the format of card number (A,1,2,3,4,5,6,7,8,9,10, Jack, Queen, King and then the suit (Diamonds, Clubs, Spades, Hearts");

        System.out.print("Enter your lead card: ");
        String leadCard = input.nextLine();
        System.out.print("Enter your first card: ");
        String card1 = input.nextLine();
        System.out.print("Enter your second card: ");
        String card2 = input.nextLine();
        System.out.print("Enter your third card: ");
        String card3 = input.nextLine();
        System.out.print("Enter your fourth card: ");
        String card4 = input.nextLine();
        System.out.print("Enter your fifth card: ");
        String card5 = input.nextLine();
        input.close();

        String opponentCardSuit = leadCard.substring(1);
        String s1 = card1.substring(1);
        String s2 = card2.substring(1);
        String s3 = card3.substring(1);
        String s4 = card4.substring(1);
        String s5 = card5.substring(1);
        int opponentCardValue = getIntRepresenationofValue(leadCard);
        int v1 = getIntRepresenationofValue(card1);
        int v2 = getIntRepresenationofValue(card2);
        int v3 = getIntRepresenationofValue(card3);
        int v4 = getIntRepresenationofValue(card4);
        int v5 = getIntRepresenationofValue(card5);

        String bestSuit = s1;
        int bestValue = v1;

        if (findBetterCard(opponentCardSuit, opponentCardValue, s2, v2, bestSuit, bestValue)) {
            bestSuit = s2;
            bestValue = v2;
        }
        if (findBetterCard(opponentCardSuit, opponentCardValue, s3, v3, bestSuit, bestValue)) {
            bestSuit = s3;
            bestValue = v3;
        }
        if (findBetterCard(opponentCardSuit, opponentCardValue, s4, v4, bestSuit, bestValue)) {
            bestSuit = s4;
            bestValue = v4;
        }
        if (findBetterCard(opponentCardSuit, opponentCardValue, s5, v5, bestSuit, bestValue)) {
            bestSuit = s5;
            bestValue = v5;
        }
        System.out.println("Your cards are " + leadCard + ", " + card1 + ", " + card2 + ", " + card3 + ", " + card4 + ", " + card5);

        System.out.println(getStringRepresenationofValue(bestValue) + bestSuit);




    }
}