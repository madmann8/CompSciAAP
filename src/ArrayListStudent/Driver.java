package ArrayListStudent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by madmann on 12/2/16.
 */
public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("data.dat"));
        Students students= new Students(scanner);
        students.run();


    }
}
