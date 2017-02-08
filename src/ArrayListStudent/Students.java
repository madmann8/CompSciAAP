package ArrayListStudent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Luke Mann on 12/2/16.
 * Class that represents a group of Students and has multiple methods to manipulate the student data including add, change, and delete. 
 */
public class Students {



//    ArrayList of students used to
private ArrayList<Student> students=new ArrayList<>();
//    Enum of main menu chieces to be executed
    private enum commandChoices {
        Add, Delete, Change, Exit,Print
    }


//    Constructor that initializes everything empty
    public Students() {
    }

//    Constructor that takes an ArrayList of Students and makes it equal to the private ArrayList
    private Students(ArrayList<Student> students) {
        this.students = students;
    }

//    Constuctor that takes a single Student
    public Students(Student student) {
        students.add(student);
    }

//    Constructor that takes a scanner that is used to read in Students
    public Students(Scanner scanner) {
        while (scanner.hasNext()) {
            String name = scanner.next();
            Integer ID=scanner.nextInt();
            Integer gradeLevel=scanner.nextInt();
            Double GPA=scanner.nextDouble();
            Student student=new Student(name,gradeLevel,GPA,ID);
            students.add(student);

        }
        scanner.close();
    }

    //Prints main menu options and prompts for selection, then returns the selection
    private String printCommands() {
        System.out.printf("%nAdd        A %n" +
                "Change     C %n" +
                "Delete     D %n" +
                "Print      P %n" +
                "Exit       E %n%n");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Option: ");
        String letter = scanner.next().trim().toLowerCase();
        while (!(letter.equals("a") || letter.equals("c") || letter.equals("d") || letter.equals("p")  || letter.equals("e"))) {
            System.out.printf("Invaid Option. %n");
            System.out.printf("Enter A,D,P,C or,X: ");
            letter = scanner.next().toLowerCase().trim();
        }
        return letter;
    }

//    Returns proper enum of method to be executed
    private commandChoices findCommandChoices() {
        String letter = printCommands();
        switch (letter) {
            case "a":
                return commandChoices.Add;
            case "c":
                return commandChoices.Change;
            case "d":
                return commandChoices.Delete;
            case "e":
                return commandChoices.Exit;
            case "p":
                return commandChoices.Print;
            default:
                System.out.printf("%n Invalid Option.");
                return findCommandChoices();
        }
    }

//    Aside from constructors, the only public method used
    public void run() {
        commandChoices command = findCommandChoices();
//        Executes methods based on menu item selected
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

//    Method that prompts the user for data to create a Student and add the Student to students
    private void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Name: ");
        String name = scanner.nextLine();

        System.out.printf("Enter Grade: ");
        Integer gradeLevel=scanner.nextInt();
        System.out.printf("Enter GPA: ");
        Double GPA=scanner.nextDouble();
        System.out.printf("Enter ID: ");
        Integer ID=scanner.nextInt();
        while (ContainsID(ID)) {
            System.out.println("ID already accounted for, try again");
            ID = scanner.nextInt();
        }
        Student tempStudent=new Student(name,gradeLevel,GPA,ID);
        students.add(tempStudent);
    }

//Helper method that is used returns a boolean based on whether or not the ID passed in corresponds with a student
    private Boolean ContainsID(Integer ID) {
        for (Student student : students) {
            if (student.getID().equals(ID)) {
                return true;
            }
        }
        return false;
    }

//    Method that prompts the user for a Student to change and executes those changes

    private void change() {
        Scanner scanner = new Scanner(System.in);
        Student student=findStudent();
        System.out.printf("Enter New Name: ");
        String name = scanner.nextLine();
        System.out.printf("Enter New ID: ");
        Integer ID=scanner.nextInt();
        while (ContainsID(ID) && !(ID.equals(student.getID()))) {
            System.out.println("ID already accounted for, try again");
            ID = scanner.nextInt();
        }
        if (student != null) {
            student.setID(ID);
        }
        if (student != null) {
            student.setName(name);
        }
    }

// Deletes entries
    private void delete() {
        students.remove(findStudent());
    }

//    Helper method used un change, add and delete that prompts the user for an existing Student and returns that student
    private Student findStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter ID: ");
        Integer ID = scanner.nextInt();
        while (!ContainsID(ID)) {
            System.out.println("ID not found, try again: ");
            ID = scanner.nextInt();        }
        for (Student student:students) {
            if (student.getID().equals(ID)) {
                return student;
            }
        }
        return null;
    }

//    Extra method that prints the students in students
    private void print() {
        for (Student student :students){
            student.toStrings();
            System.out.println("");

        }
    }


}


