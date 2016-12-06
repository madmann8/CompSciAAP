package ArrayListStudent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by madmann on 12/2/16.
 */
public class Students {
    ArrayList<Student> students=new ArrayList<>();

    private enum commandChoices {
        Add, Delete, Change, Exit
    }

    public Students() {
    }
    public Students(Student student) {
        students.add(student);
    }
    public Students(Scanner scanner) {
        while (scanner.hasNext()) {
            String name = scanner.next();
            Integer gradeLevel=scanner.nextInt();
            Double GPA=scanner.nextDouble();
            Integer ID=scanner.nextInt();
            Student student=new Student(name,gradeLevel,GPA,ID);
            students.add(student);

        }
        scanner.close();
    }

    private String printCommands() {
        System.out.printf("%nAdd        A %n" +
                "Change     C %n" +
                "Delete     D %n" +
                "Exit       E %n%n");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Option: ");
        String letter = scanner.next().trim().toLowerCase();
        while (!(letter.equals("a") || letter.equals("c") || letter.equals("d")  || letter.equals("x"))) {
            System.out.printf("Invaid Option. %n");
            System.out.printf("Enter A,D,P,C or,X: ");
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
            case "x":
                return commandChoices.Exit;
            default:
                System.out.printf("%n Invalid Option.");
                return findCommandChoices();
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
            command = findCommandChoices();
        }
        System.out.printf("%nProgram Done");
    }

    private Students(ArrayList<Student> students) {
        this.students = students;
    }

    private void add(Student student) {
        students.add(student);
    }
    private void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Name: ");
        String name = scanner.next();
        while (containsName(name)) {
            System.out.println("Name already accounted for, try again");
            name = scanner.next();
        }
        System.out.printf("Enter Grade: ");
        Integer gradeLevel=scanner.nextInt();
        System.out.printf("Enter GPA: ");
        Double GPA=scanner.nextDouble();
        System.out.printf("Enter ID: ");
        Integer ID=scanner.nextInt();
        Student tempStudent=new Student(name,gradeLevel,GPA,ID);
        students.add(tempStudent);
    }

    private Boolean containsName(String name) {
        for (Student student : students) {
            if (student.getName().toLowerCase().equals(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private void change() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter New Name: ");
        Student student=findStudent();
        String name = scanner.next();
        while (containsName(name)) {
            System.out.println("Name already accounted for, try again");
            name = scanner.next();
        }
        System.out.printf("Enter New ID: ");
        Integer ID=scanner.nextInt();
        student.setID(ID);
        student.setName(name);
    }

    private void delete() {
        students.remove(findStudent());
    }


    private Student findStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Name: ");
        String name = scanner.next();
        name= name.toLowerCase();
        while (containsName(name)) {
            System.out.println("Name already accounted for, try again");
            name = scanner.next();
        }
        for (Student student:students) {
            if (student.getName().toLowerCase().equals(name.toLowerCase())) {
                return student;
            }
        }
        return null;
    }


}
