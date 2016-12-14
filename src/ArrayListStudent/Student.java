package ArrayListStudent;

/**
 * Created by Luke Mann on 11/28/16.
 * Class that represents a studnet and thier infomation including name, ID, GPA, and grade level.
 */
public class Student {
    private String name;
    private Integer gradeLevel;
    private Double GPA;
    private Integer ID;

    public Student(String name, Integer gradeLevel, Double GPA, Integer ID) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
        this.ID = ID;
    }
// Accesssor method for the name
    public String getName() {
        return name;
    }
    // Accesssor method for the grade level

    public Integer getGradeLevel() {
        return gradeLevel;
    }
    // Accesssor method for the GPA

    public Double getGPA() {
        return GPA;
    }
    // Accesssor method for the ID

    public Integer getID() {
        return ID;
    }
// Method used to set the name
    public void setName(String name) {
        this.name = name;
    }
    // Method used to set the ID
    public void setID(Integer ID) {
        this.ID = ID;
    }
//Returns if Student passed in is idential to Student based on ID
    public boolean equals(Student in) {
        return this.getID() == in.getID();
    }

    // Method used to print the Student and the student's data
    public void toStrings() {
        System.out.printf("Name: "+ name);
        System.out.println("");
        System.out.printf("ID: "+ID);
        System.out.println("");
        System.out.printf("GPA: "+GPA);
        System.out.println("");
        System.out.printf("Grade Level: "+gradeLevel+"th");
        System.out.println("");
    }
}

