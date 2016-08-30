package MannBasic.ReviewPrograms.WordToCharForLoop;

import java.util.Scanner;

/**
 * Created by madmann on 8/30/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Enter word: %n");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int i;
        for (i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}

