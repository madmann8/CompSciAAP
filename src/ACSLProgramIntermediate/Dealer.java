package ACSLProgramIntermediate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by madmann on 12/13/16.
 */
public class Dealer {
    private enum Suits {
        CLUBS("C", 0),
        DIAMONDS("D", 1),
        HEARTS("H", 2),
        SPADES("S", 3);
        String string;
        Integer rank;

        Suits(String s, Integer r) {
            string = s;
            rank = r;
        }


        public static Suits valueOf(char c) {
            switch (c) {
                case 'C':
                    return CLUBS;
                case 'D':
                    return DIAMONDS;
                case 'H':
                    return HEARTS;
                case 'S':
                    return SPADES;
                default:
                    return null;
            }
        }
    }

    private enum Values {
        ACE("A", 0),
        TWO("2", 1),
        THREE("3", 2),
        FOUR("4", 3),
        FIVE("5", 4),
        SIX("6", 5),
        SEVEN("7", 6),
        EIGHT("8", 7),
        NINE("9", 8),
        TEN("T", 9),
        JACK("J", 10),
        QUEEN("Q", 11),
        KING("K", 12);
        String string;
        Integer rank;

        Values(String s, Integer r) {
            string = s;
            rank = r;
        }

        public static Values valueOf(char c) {
            switch (c) {
                case 'A':
                    return ACE;
                case '2':
                    return TWO;
                case '3':
                    return THREE;
                case '4':
                    return FOUR;
                case '5':
                    return FIVE;
                case '6':
                    return SIX;
                case '7':
                    return SEVEN;
                case '8':
                    return EIGHT;
                case '9':
                    return NINE;
                case 'T':
                    return TEN;
                case 'J':
                    return JACK;
                case 'Q':
                    return QUEEN;
                case 'K':
                    return KING;
                default:
                    return null;
            }
        }
//                    switch (in) {
//            case "A":
//                return ACE;
//            case "2":
//                return TWO;
//            case "3":
//                return THREE;
//            case "4":
//                return FOUR;
//            case "5":
//                return FIVE;
//            case "6":
//                return SIX;
//            case "7":
//                return SEVEN;
//            case "8":
//                return EIGHT;
//            case "9":
//                return NINE;
//            case "T":
//                return TEN;
//            case "J":
//                return JACK;
//            case "Q":
//                return QUEEN;
//            case "K":
//                return KING;
//            default:
//                return null;
//        }

    }

    private boolean isPrefered(Suits faceUpSuit, Values faceUpValue, Suits suit1, Values value1, Suits suit2, Values value2) {
        if (suit1.equals(faceUpSuit) && suit2.equals(faceUpSuit)) {
//            PROBLEM: THE HIGHEST CARD IZ BEIGN PLAYED NOT LOWEST THAT IS HIGHER THEN THE OPONENT
            if(!(value1.rank<=faceUpValue.rank&&value2.rank<=faceUpValue.rank)){
                if (value1.rank>faceUpValue.rank && (!(value2.rank>faceUpValue.rank))){
                    return true;
                }
                else {
                    return false;
                }
            }
//            if (value1.rank < faceUpValue.rank && value2.rank < faceUpValue.rank) {
//                if (value1.rank < value2.rank) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//            if (value1.rank >= faceUpValue.rank && value2.rank> faceUpValue.rank && value1.rank < value2.rank) {
//                return true;
//            }
//            if (value2.rank >= faceUpValue.rank && value1.rank> faceUpValue.rank && value2.rank < value1.rank) {
//                return false;
//            }
            else {
                if (value1.rank < value2.rank) {
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
        if (value1.rank < value2.rank) {
            return true;
        } else if (value1.rank > value2.rank) {
            return false;
        } else {
            if (suit1.rank < suit2.rank) {
                return true;
            } else {
                return false;
            }
        }
    }

    public Dealer(Scanner scanner) {
        System.out.println("Enter Face Up Card:");
        String faceUpCard = scanner.nextLine();
        Values faceUpValue = Values.valueOf(faceUpCard.toCharArray()[0]);
        Suits faceUpSuit = Suits.valueOf(faceUpCard.toCharArray()[1]);
        System.out.println("Enter Five Cards:");
        char[] card1 = scanner.nextLine().toCharArray();
        System.out.println("");
        char[] card2 = scanner.nextLine().toCharArray();
        System.out.println("");
        char[] card3 = scanner.nextLine().toCharArray();
        System.out.println("");
        char[] card4 = scanner.nextLine().toCharArray();
        System.out.println("");
        char[] card5 = scanner.nextLine().toCharArray();
        System.out.println("");
        Values value1 = Values.valueOf(card1[0]);
        Values value2 = Values.valueOf(card2[0]);
        Values value3 = Values.valueOf(card3[0]);
        Values value4 = Values.valueOf(card4[0]);
        Values value5 = Values.valueOf(card5[0]);
        Suits suit1 = Suits.valueOf(card1[1]);
        Suits suit2 = Suits.valueOf(card2[1]);
        Suits suit3 = Suits.valueOf(card3[1]);
        Suits suit4 = Suits.valueOf(card4[1]);
        Suits suit5 = Suits.valueOf(card5[1]);
        HashMap<Values, Suits> map = new HashMap<>();
        map.put(value1, suit1);
        map.put(value2, suit2);
        map.put(value3, suit3);
        map.put(value4, suit4);
        map.put(value5, suit5);
        Suits bestSuit = suit1;
        Values bestValue = value1;
        for (Map.Entry<Values, Suits> entry : map.entrySet()) {
            if (isPrefered(faceUpSuit, faceUpValue, entry.getValue(), entry.getKey(), bestSuit, bestValue)) {
                bestSuit = entry.getValue();
                bestValue = entry.getKey();
            }
        }
        System.out.println("Output:");
        System.out.print(bestValue.string + bestSuit.string);
    }
}
