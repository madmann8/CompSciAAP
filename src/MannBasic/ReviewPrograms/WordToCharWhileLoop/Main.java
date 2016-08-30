package MannBasic.ReviewPrograms.WordToCharWhileLoop;

import java.util.Scanner;

/**
 * Created by madmann on 8/30/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Enter word: %n");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int i = 0;
        while (i < word.length()) {
            System.out.println(word.charAt(i));
            i++;
        }
    }
}


