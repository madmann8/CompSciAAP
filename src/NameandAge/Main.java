package NameandAge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by madmann on 9/1/16.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("data.dat"));
        DataSet data= new DataSet(scanner);
        data.run();

    }
}
