/////*Luke Mann 8-28-16*/
//package NameandAge;
//
//import java.util.*;
//
//class DataSet {
//    //Represents length of mAges and mNames
//    private int mArrayLength;
//
//    private Integer[] mAges = new Integer[100];
//    private String[] mNames = new String[100];
//
//    //Constructor
//    DataSet(Scanner readFile) {
//        readFile(readFile);
//    }
//
//    //Inspired by Internet, used in printAgeOrder to sort TreeMap by values
//    private <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
//        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
////                Compares values in lambda
//                (entry1, entry2) -> {
//                    int res = entry1.getValue().compareTo(entry2.getValue());
//                    return res != 0 ? res : 1;
//                }
//        );
//        sortedEntries.addAll(map.entrySet());
//        //Returns SortedSetof entries
//        return sortedEntries;
//    }
//
//    //One time executing read file program
//    private void readFile(Scanner readFile) {
//        int i = 0;
//        while (readFile.hasNext()) {
//            String name = readFile.next();
//            Integer age = readFile.nextInt();
//            mNames[i] = name;
//            mAges[i] = age;
//            i++;
//        }
//        mArrayLength = i;
//    }
//
//    //Prints main menu options and prompts for selection, then returns the selection
//    private String printCommands() {
//        System.out.printf("%nAdd        A %n" +
//                "Change     C %n" +
//                "Delete     D %n" +
//                "Print      P %n" +
//                "Exit       X %n%n");
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter Option: ");
//        String letter = scanner.next().trim().toLowerCase();
//        while (!(letter.equals("a") || letter.equals("c") || letter.equals("d") || letter.equals("p") || letter.equals("x"))) {
//            System.out.println("Invaid Option.");
//            System.out.println("Enter A,C,D,P,or X: ");
//            letter = scanner.next().toLowerCase().trim();
//        }
//        return letter;
//    }
//
//    private commandChoices findCommandChoices() {
//        String letter = printCommands();
//        switch (letter) {
//            //Compares selected option and returns enum of selection
//            case "a":
//                return commandChoices.Add;
//            case "c":
//                return commandChoices.Change;
//            case "d":
//                return commandChoices.Delete;
//            case "p":
//                return commandChoices.Print;
//            case "x":
//                return commandChoices.Exit;
//            //Default should never be reached
//            default:
//                System.out.printf("%n Invalid Option.");
//                return findCommandChoices();
//        }
//    }
//
//    //Add method
//    private void add() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter Name: ");
//        String name = scanner.next();
//        //While name already accounted for:
//        while (Arrays.asList(mNames).contains(name)) {
//            System.out.printf("%nName already accounted for, try again:");
//            name = scanner.next();
//        }
//        System.out.printf("Enter Age: ");
//        int age = scanner.nextInt();
//        //Capitalized first letter
//        mNames[mArrayLength] = name.substring(0, 1).toUpperCase() + name.substring(1);
//        mAges[mArrayLength] = age;
//        mArrayLength++;
//    }
////Change method
//    private void change() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter Name: ");
//        String oldName = scanner.next().trim().toLowerCase();
//        //Capitalizes first letter
//        oldName = oldName.substring(0, 1).toUpperCase() + oldName.substring(1);
//        if (Arrays.asList(mNames).contains(oldName)) {
//            int tempArrayLocation = nameArrayLocation(oldName);
//            System.out.printf("%s- Enter Change:", oldName);
//            String newName = scanner.next();
////            While it does not have the new name
//            if (!(Arrays.asList(mNames).contains(newName))) {
//
//
//                System.out.printf("%d- Enter Change:%n", ageFromName(oldName));
//                scanner.nextLine();
//                String newAgeString = scanner.nextLine();
////                If new age is not empty
//                if (!(newAgeString.equals(""))) {
//                    mNames[tempArrayLocation] = newName;
//                    mAges[tempArrayLocation] = Integer.parseInt(newAgeString);
//                    int newAge = Integer.parseInt(newAgeString);
//                    System.out.printf("%s %d %n", newName, newAge);
//                    System.out.printf("Changes Complete %n");
//                    //Executes if no age is entered
//                } else {
//                    mAges[tempArrayLocation] = ageFromName(oldName);
//                    mNames[tempArrayLocation] = newName;
//                    System.out.printf("%s %d %n", mNames[tempArrayLocation], mAges[tempArrayLocation]);
//                    System.out.printf("Changes Complete %n");
//                    System.out.printf("%nNo age Entered.Exiting.%n");
//                }
//
//
//            }
////            Executes if new  name is not already accounted for
//        } else {
//            System.out.println("Invalid name. Would you like to try again? (Y or N)");
//            String choice = scanner.next().trim().toLowerCase();
//            if (choice.equals("y")) {
//                change();
//            }
//        }
//
//    }
//// Evaluates letters based on execution of printPrintOptions
// private void print() {
//        String letter = printPrintOptions();
//        if (letter.equals("l")) {
//            printList();
//        }
//        if (letter.equals("n")) {
//            printNameOrder();
//        }
//        if (letter.equals("a")) {
//            printAgeOrder();
//        }
//    }
////Prints options for printing of list and returns selectoin
//    private String printPrintOptions() {
//        System.out.printf("Print List           L%n" +
//                "Print Name Order     N%n" +
//                "Print Age Order      A%n" +
//                "Back to Main Menu    M%n");
//        System.out.printf("Enter Option:    ");
//        Scanner scanner = new Scanner(System.in);
//        String letter = scanner.next().trim().toLowerCase();
//        if (!(letter.equals("l") || letter.equals("n") || letter.equals("a") || letter.equals("m"))) {
//            return printPrintOptions();
//        }
//        return letter;
//    }
//
//    //Prints names and age sorted by age
//    private void printAgeOrder() {
//        Map<String, Integer> map = new TreeMap<>();
//        for (int i = 0; i < mNames.length; i++) {
////            Executes if name is not null
//            if (mNames[i] != null) {
//                map.put(mNames[i], ageFromName(mNames[i]));
//            }
//        }
//        System.out.printf("Age   Name %n");
//        for (Map.Entry<String, Integer> entry : entriesSortedByValues(map)) {
//            Integer age = entry.getValue();
//            String name = entry.getKey();
//            //Prints age next to name
//            System.out.printf("%d %10s %n", age, name);
//        }
//    }
////Sorts names and age sorted by name
//    private void printNameOrder() {
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String mName : mNames) {
//            //            Executes if name is not null
//            if (mName != null) {
//                map.put(mName, ageFromName(mName));
//            }
//        }
//        int e = 0;
//        String[] names = new String[map.size()];
//        for (String name : map.keySet()) {
//            names[e] = name;
//            e++;
//        }
//        Arrays.sort(names);
//        int f;
//        System.out.printf("      Name Age %n");
//
//        for (f = 0; f < names.length; f++) {
////            Prints name next to age
//            System.out.printf("%10s %d %n", names[f], map.get(names[f]));
//        }
//    }
////Prints ages next no names in order that they are in mNames and mAges
//    private void printList() {
////        Used HashMap to avoid nullPointerException
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String mName : mNames) {
//            if (mName != null) {
//                map.put(mName, ageFromName(mName));
//            }
//        }
//        int e = 0;
//        String[] names = new String[map.size()];
//        for (String name : map.keySet()) {
//            names[e] = name;
//            e++;
//        }
//        int f;
//        System.out.printf("      Name Age %n");
//        //            Prints name next to age
//        for (f = 0; f < names.length; f++) {
//            System.out.printf("%10s %d %n", names[f], map.get(names[f]));
//        }
//    }
////ONLY PROGRAM THAT NEEDS TO BE EXTERNALLY EXECUTED
//    void run() {
//        commandChoices command = findCommandChoices();
//        while (command != commandChoices.Exit) {
//            if (command == commandChoices.Add) {
//                add();
//            }
//            if (command == commandChoices.Delete) {
//                delete();
//            }
//            if (command == commandChoices.Change) {
//                change();
//            }
//            if (command == commandChoices.Print) {
//                print();
//
//            }
//            command = findCommandChoices();
//        }
//        System.out.printf("%nProgram Done");
//    }
//// Deletes entries
//    private void delete() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter Name: ");
//        String oldName = scanner.next();
//        if (Arrays.asList(mNames).contains(oldName)) {
//            String[] tempNames = new String[mArrayLength];
//            Integer[] tempAges = new Integer[mArrayLength];
//            for (int i = 0; i < mArrayLength; i++) {
//                String name = mNames[i];
//                if (!(name.equals(oldName))) {
//                    tempNames[i] = mNames[i];
//                    tempAges[i] = mAges[i];
//                }
//            }
//            mNames = tempNames;
//            mAges = tempAges;
//            System.out.println("Changes complete.");
//        } else System.out.printf("Invalid name. Try again.");
//    }
//
////  Helper method that provides a age from mAges based on name
//    private Integer ageFromName(String name) {
//        int location = nameArrayLocation(name);
//        return mAges[location];
//    }
////  Helper method that provides index of a name from provided name
//    private int nameArrayLocation(String name) {
//        int e = 0;
//        for (int i = 0; i < mNames.length; i++) {
//
//            if (mNames[i].equals(name)) {
//                e = i;
//                break;
//            }
//        }
//        return e;
//    }
//
////    Enum of main menu chieces to be executed
//    private enum commandChoices {
//        Add, Delete, Change, Print, Exit;
//    }
//}