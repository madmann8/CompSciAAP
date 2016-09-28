package NameandAge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Enter path for data here:
        Scanner scanner = new Scanner(new File("data.dat"));
        DataSet data= new DataSet(scanner);
        //Use data.run() to execute program
        data.run();

    }

}
