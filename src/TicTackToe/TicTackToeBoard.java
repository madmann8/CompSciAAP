//package TicTackToe;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
///**
// *A class that represnts a ticktac toe board with two public functions, run and reset
// * Created by Luke Mann on 12/2/16.
// */
//public class TicTackToeBoard {
//    String[][] board = {{"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}};
//    ArrayList<String> accountedFor=new ArrayList<>();
//    boolean Xturn = true;
//
//
//    public TicTackToeBoard() {
//    }
////Prints the board with letters
//    private void printBoard() {
//        System.out.println("     |     |     ");
//        System.out.println("  " + board[0][0] + "  |  " + board[0][1] + "  |  " + board[0][2]);
//        System.out.println("_____|_____|_____");
//        System.out.println("     |     |     ");
//        System.out.println("  " + board[1][0] + "  |  " + board[1][1] + "  |  " + board[1][2]);
//        System.out.println("_____|_____|_____");
//        System.out.println("     |     |     ");
//        System.out.println("  " + board[2][0] + "  |  " + board[2][1] + "  |  " + board[2][2]);
//        System.out.println("     |     |     ");
//    }
//
//
//
////    Main executable function
//    public void run() {
//reset();
//        int turnCounter=0;
////        Boolean Xturn represnts which person's turn it is
//        while (!isDone()&&turnCounter<9) {
//            if (Xturn) {
//                System.out.println("X's turn");
//                printBoard();
//                System.out.println("X: Select Spot");
//                Scanner scanner = new Scanner(System.in);
//                String letter = scanner.next().trim().toLowerCase();
//                while (!accountedFor.contains(letter)) {
//                    System.out.println("X: Spot already accounted for, try again");
//                    letter = scanner.next();
//                }
//                accountedFor.remove(letter);
//                switch (letter) {
//                    case "a":
//                        board[0][0] = "X";
//                        break;
//
//                    case "b":
//                        board[0][1] = "X";
//                        break;
//
//                    case "c":
//                        board[0][2] = "X";
//                        break;
//
//                    case "d":
//                        board[1][0] = "X";
//                        break;
//
//                    case "e":
//                        board[1][1] = "X";
//                        break;
//
//                    case "f":
//                        board[1][2] = "X";
//                        break;
//
//                    case "g":
//                        board[2][0] = "X";
//                        break;
//
//                    case "h":
//                        board[2][1] = "X";
//                        break;
//                    case "i":
//                        board[2][2] = "X";
//                    default:
//                }
//                Xturn = false;
//                turnCounter++;
//                if (isDone()) {
//                    System.out.println("X wins!");
//                    return;
//                }
//                if (turnCounter==9){
//                    System.out.println("It's A Tie!");
//                    return;
//                }
//            }
//                if (!Xturn) {
//                    System.out.println("O's turn");
//                    printBoard();
//                    System.out.println("O: Select Spot");
//                    Scanner scanner = new Scanner(System.in);
//                    String letter = scanner.next().trim().toLowerCase();
//                    while (!accountedFor.contains(letter)){
//                        System.out.println("O: Spot already accounted for, try again");
//                        letter = scanner.next();
//                    }
//                    accountedFor.remove(letter);
//                    switch (letter) {
//                        case "a":
//                            board[0][0] = "O";
//                            break;
//
//                        case "b":
//                            board[0][1] = "O";
//                            break;
//
//                        case "c":
//                            board[0][2] = "O";
//                            break;
//
//                        case "d":
//                            board[1][0] = "O";
//                            break;
//
//                        case "e":
//                            board[1][1] = "O";
//                            break;
//
//                        case "f":
//                            board[1][2] = "O";
//                            break;
//
//                        case "g":
//                            board[2][0] = "O";
//                            break;
//
//                        case "h":
//                            board[2][1] = "O";
//                            break;
//
//                        case "i":
//                            board[2][2] = "O";
//                    }
//                    Xturn = true;
//                    turnCounter++;
//
//                    if (isDone()){
//                        System.out.println("O Wins!");
//                        return;
//                    }
//                    if (turnCounter==9){
//                        System.out.println("It's A Tie!");
//                        return;
//                    }
//                }
//        }
//    }
//
////If any combonations are done, it returns true
//    private boolean isDone() {
//        if (
//                isThree(board[0][0], board[0][1], board[0][2]) ||
//                isThree(board[1][0], board[1][1], board[1][2]) ||
//                isThree(board[2][0], board[2][1], board[2][2]) ||
//
//                isThree(board[0][0], board[1][0], board[2][0]) ||
//                isThree(board[0][1], board[1][1], board[2][1]) ||
//                isThree(board[0][2], board[1][2], board[2][2]) ||
//
//                isThree(board[2][0], board[1][1], board[0][2]) ||
//                isThree(board[2][2], board[1][1], board[0][0])) {
//            return true;
//        }
//
//
//        return false;
//    }
//
//    private  boolean isThree(String string, String string2, String string3) {
//        if (string.equals(string2) && string3.equals(string2)) {
//            return true;
//        }
//
//        return false;
//    }
//
//
////    Resets the board
//
//    public void reset() {
//        accountedFor.add("a");
//        accountedFor.add("b");
//        accountedFor.add("c");
//        accountedFor.add("d");
//        accountedFor.add("e");
//        accountedFor.add("f");
//        accountedFor.add("g");
//        accountedFor.add("h");
//        accountedFor.add("i");
//        String[][] tempBoard = {{"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}};
//        board=tempBoard;
//        Xturn=true;
//    }
//
//
//}
