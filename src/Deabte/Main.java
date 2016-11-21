package Deabte;

import com.sun.tools.hat.internal.parser.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by madmann on 11/11/16.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a line of text");
        String userInput = new Scanner(new File("foo.txt")).useDelimiter("\\Z").next();

        userInput = userInput.toLowerCase();

        userInput = userInput.replaceAll("\\W", " ");     // strip out any non words.
        userInput = userInput.replaceAll("  ", " ");      // strip out any double spaces
        //   created from stripping out non words
        //   in the first place!
        String[] tokens = userInput.split(" ");
        System.out.println(userInput);

        ArrayList<String> items = new ArrayList<String>();

        items.addAll(Arrays.asList(tokens));

        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%s: ", items.get(i));
            for (int j = 0; j < items.size(); j++) {
                if (items.get(i).equals(items.get(j)))
                    count++;
                if (items.get(i).equals(items.get(j)) && count > 1)
                    items.remove(j);                      // after having counted at least
            }                                               // one, remove duplicates from List
            System.out.printf("%d\n", count);
            count = 0;
        }
    }
}

