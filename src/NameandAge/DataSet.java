package NameandAge;


import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;
import java.lang.Integer;

/**
 * Created by madmann on 9/1/16.
 */
public class DataSet {
    private enum commandChoices {
        Add, Delete, Change, Print, Exit;
    }

    int mArrayLength;

    Integer[] mAges = new Integer[100];
    String[] mNames = new String[100];

    public DataSet(Scanner readFile) {
        readFile(readFile);
    }

    private void readFile(Scanner readFile) {
        int i = 0;
        while (readFile.hasNext()) {
            String name = readFile.next();
            Integer age = readFile.nextInt();
            mNames[i] = name;
            mAges[i] = age;
            i++;
        }
        mArrayLength = i;
    }

    private String printCommands() {
        System.out.printf("%nAdd        A %n" +
                "Change     C %n" +
                "Delete     D %n" +
                "Print      P %n" +
                "Exit       E %n%n");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Option: ");
        String letter = scanner.next().trim().toLowerCase();
        while (!(letter.equals("a") || letter.equals("c") || letter.equals("d") || letter.equals("p") || letter.equals("x"))) {
            System.out.printf("Invaid Option. %n");
            System.out.printf("Enter A,D,P,X: ");
            letter = scanner.next().toLowerCase().trim();
        }
        return letter;
    }

    private commandChoices findCommandChoices() {
        String letter = printCommands();
        switch (letter) {
            case "a":
                return commandChoices.Add;
            case "c":
                return commandChoices.Change;
            case "d":
                return commandChoices.Delete;
            case "p":
                return commandChoices.Print;
            case "x":
                return commandChoices.Exit;
            default:
                System.out.printf("%n Invalid Option.");
                return findCommandChoices();
        }
    }

    private void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Name: ");
        String name = scanner.next();
        while (Arrays.asList(mNames).contains(name)) {
            System.out.printf("%nName already accounted for, try again:");
            name = scanner.next();
        }
        System.out.printf("Enter Age: ");
        int age = scanner.nextInt();
        mNames[mArrayLength + 1] = name;
        mAges[mArrayLength + 1] = age;
    }

    //TODO: Make sure name not found appears multiple times
    private void change() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Name: ");
        String oldName = scanner.next();
        if (Arrays.asList(mNames).contains(oldName)) {
            System.out.printf("%s- Enter Change:", oldName);
            String newName = scanner.next();
            while (!(Arrays.asList(mNames).contains(newName))) {
                System.out.printf("%d- Enter Change:%n", ageFromName(oldName));
                scanner.nextLine();
                String newAgeString = scanner.nextLine();
                if (!(Arrays.asList(mNames).contains(newName))) {
                    mNames[arrayLocation(oldName)] = newName;
                    mAges[arrayLocation(ageFromName(oldName))] = Integer.parseInt(newAgeString);
                    int newAge = Integer.parseInt(newAgeString);
                    mAges[mArrayLength + 1] = newAge;
                    mNames[mArrayLength + 1] = newName;
                    mArrayLength++;
                    System.out.printf("%s %d %n", newName, newAge);
                    System.out.printf("Changes Complete %n");

                } else {
                    mAges[mArrayLength + 1] = ageFromName(oldName);
                    mNames[mArrayLength + 1] = newName;
                    mArrayLength++;
                    System.out.printf("%s %d %n", mAges[arrayLocation(ageFromName(oldName))], mNames[arrayLocation(newName)]);
                    System.out.printf("Changes Complete %n");
                    System.out.printf("%nNo age Entered.Exiting.%n");
                }
            }
        } else {
            System.out.printf("Invalid name. Would you like to try again");
            String choice = scanner.next().trim().toLowerCase();
            if (choice == "y") {
                change();
            }
        }

    }

    private void print() {
        String letter = printPrintOptions();
        if (letter.equals("l")) {
            printList();
        }
        if (letter.equals("n")) {
            printNameOrder();
        }
        if (letter.equals("a")) {
            printAgeOrder();
        }
    }

    private String printPrintOptions() {
        System.out.printf("Print List           L%n" +
                "Print Name Order     N%n" +
                "Print Age Order      A%n" +
                "Back to Main Menu    M%n");
        System.out.printf("Enter Option:    ");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next().trim().toLowerCase();
        if (!(letter.equals("l") || letter.equals("n") || letter.equals("a") || letter.equals("m"))) {
            return printPrintOptions();
        }
        return letter;
    }

    private void printAgeOrder() {
        sortAge(mNames, mAges);
        int i;
        for (i = 0; i < mAges.length; i++) {
            int age = mAges[i];
            String name = mNames[i];
            System.out.printf("%d %10s %n", age, name);
        }
    }

    private void printNameOrder() {
        String[] tempArray = new String[mNames.length];
        tempArray = mNames;
        int i;
        Arrays.sort(tempArray);
        for (i = 0; i < tempArray.length; i++) {
            String age = tempArray[i];
            int name = ageFromName(age);
            System.out.printf("%d %10s %n", name, age);
        }
    }

    private void printList() {
        int i;
        for (i = 0; i < mNames.length; i++) {
            int age = mAges[i];
            String name = nameFromAge(age);
            if (name != null) {
                System.out.printf("%10s %d %n", name, age);
            }
        }
    }

    public void run() {
        commandChoices command = findCommandChoices();
        while (command != commandChoices.Exit) {
            if (command == commandChoices.Add) {
                add();
            }
            if (command == commandChoices.Delete) {
                delete();
            }
            if (command == commandChoices.Change) {
                change();
            }
            if (command == commandChoices.Print) {
                print();

            }
            command = findCommandChoices();
        }
        System.out.printf("%nProgram Done");
    }

    private void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Name: ");
        String oldName = scanner.next();
        if (Arrays.asList(mNames).contains(oldName)) {
            int i;
            for (i = 0; i < mNames.length - 1; i++) {
                mNames[i] = mNames[i + 1];
                mAges[i] = mAges[i + 1];
            }
        } else System.out.printf("Invalid name. Try again.");
        mArrayLength++;
    }

    private String nameFromAge(Integer age) {
        int location = Arrays.asList(mAges).indexOf(age);
        return mNames[location];

    }

    private Integer ageFromName(String name) {
        int location = Arrays.asList(mNames).indexOf(name);
        return mAges[location];
    }

    private int arrayLocation(String name) {
        return Arrays.asList(mNames).indexOf(name);
    }

    private int arrayLocation(Integer age) {
        return Arrays.asList(mAges).indexOf(age);
    }

    private void sortAge(String[] name, Integer[] age) {
        for (int i = 0; i < age.length - 1; i++) {
            for (int e = 0; e < age.length - 1 - i; e++) {
                if (age[e] > age[e + 1]) {
                    int tempArray = age[e];
                    age[e] = age[e + 1];
                    age[e + 1] = tempArray;
                    String tempArray2 = name[e];
                    name[e] = name[e + 1];
                    name[e + 1] = tempArray2;
                }
            }
        }
    }
}

