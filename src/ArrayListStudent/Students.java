package ArrayListStudent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by madmann on 12/2/16.
 */
public class Students {
    ArrayList<Student> students=new ArrayList<>();

    public Students() {
    }
    public Students(Student student) {
        students.add(student);
    }

    public Students(ArrayList<Student> students) {
        this.students = students;
    }

    public void add(Student student) {
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

    public void change() {
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

    public void delete() {
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
