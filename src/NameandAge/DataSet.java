package NameandAge;


import java.util.*;
import java.lang.Integer;

/**
 * Created by madmann on 9/1/16.
 */
public class DataSet {
    private enum commandChoices {
        Add, Delete, Change, Print, Exit;
    }

    HashMap<String, Integer> mDataMap = new HashMap<>();

    public DataSet(Scanner readFile) {
        readFile(readFile);
    }

    private void readFile(Scanner readFile) {
        while (readFile.hasNext()) {
            String name = readFile.next();
            Integer age = readFile.nextInt();
            mDataMap.put(name.trim(), age);
        }
        readFile.close();
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
        System.out.printf("Enter Age: ");
        int age = scanner.nextInt();
        mDataMap.put(name, age);
    }
//TODO: Fix duplicate names
    private void change() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Name: ");
        String oldName = scanner.next();
        if (mDataMap.containsKey(oldName)) {
            System.out.printf("%s- Enter Change:", oldName);
            String newName = scanner.next();
            System.out.printf("%d- Enter Change:%n", mDataMap.get(oldName));
            int newAge = scanner.nextInt();
            if (newName.trim()=="") {
                scanner.close();
            }
            else {
                mDataMap.remove(oldName);
                mDataMap.put(newName, newAge);
            }

            System.out.printf("%s %d %n", newName, newAge);
            System.out.printf("Changes Complete %n");
        } else System.out.printf("Invalid name. Try again.");
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
        int[] ages = new int[mDataMap.size()];
        int i = 0;
        for (int age : mDataMap.values()) {
            ages[i] = age;
            i++;
        }
        Arrays.sort(ages);
        int e;
        for (e = 0; e < ages.length; e++) {
            System.out.printf("%s %n", ages[e]);
        }
    }

    private void printNameOrder() {
        String[] names = new String[mDataMap.size()];
        int i = 0;
        for (String name : mDataMap.keySet()) {
            names[i] = name;
            i++;
        }
        Arrays.sort(names);
        int e;
        for (e = 0; e < names.length; e++) {
            System.out.printf("%s %n", names[e]);
        }
    }

    private void printList() {
        String[] names = new String[mDataMap.size()];
        int i = 0;
        for (String name : mDataMap.keySet()) {
            names[i] = name;
            i++;
        }
        Arrays.sort(names);
        int e;
        System.out.printf("   Name    Age %n");
        for (e = 0; e < names.length; e++) {
            System.out.printf("%10s %d %n", names[e], mDataMap.get(names[e]));
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
        if (mDataMap.containsKey(oldName)) {
            mDataMap.remove(oldName);
            System.out.printf("Changes Complete %n");
        } else System.out.printf("Invalid name. Try again.");
    }
}

