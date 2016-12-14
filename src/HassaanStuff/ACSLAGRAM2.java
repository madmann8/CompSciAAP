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

    private static boolean isPrefered(String faceUpSuit, int faceUpValue, String suit1, int value1, String suit2, int value2) {
        if (suit1.equals(faceUpSuit) && suit2.equals(faceUpSuit)) {
            if (!(value1 <= faceUpValue && value2 <= faceUpValue)) {
                if (value1 > faceUpValue && (!(value2 > faceUpValue))) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (value1 < value2) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (suit1.equals(faceUpSuit)) {
            return true;
        }
        if (suit2.equals(faceUpSuit)) {
            return false;
        }
        if (value1 < value2) {
            return true;
        } else if (value1> value2) {
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
        String suit1 = leadCard.substring(1);
        String suit2 = leadCard.substring(1);
        String suit3 = leadCard.substring(1);
        String suit4 = leadCard.substring(1);
        String suit5 = leadCard.substring(1);
        int opponentCardValue = getIntRepresenationofValue(leadCard);
        int value1 = getIntRepresenationofValue(card1);
        int value2 = getIntRepresenationofValue(card2);
        int value3 = getIntRepresenationofValue(card3);
        int value4 = getIntRepresenationofValue(card4);
        int value5 = getIntRepresenationofValue(card5);

        String bestSuit = suit1;
        int bestValue = value1;

        if (isPrefered(opponentCardSuit, opponentCardValue, suit2, value2, bestSuit, bestValue)) {
            bestSuit = suit2;
            bestValue = value2;
        }
        if (isPrefered(opponentCardSuit, opponentCardValue, suit3, value3, bestSuit, bestValue)) {
            bestSuit = suit3;
            bestValue = value3;
        }
        if (isPrefered(opponentCardSuit, opponentCardValue, suit4, value4, bestSuit, bestValue)) {
            bestSuit = suit4;
            bestValue = value4;
        }
        if (isPrefered(opponentCardSuit, opponentCardValue, suit5, value5, bestSuit, bestValue)) {
            bestSuit = suit5;
            bestValue = value5;
        }
        System.out.println("Your cards are " + leadCard + ", " + card1 + ", " + card2 + ", " + card3 + ", " + card4 + ", " + card5);

        System.out.println(getStringRepresenationofValue(bestValue) + bestSuit);




    }
}