package ArrayListStudent;

/**
 * Created by madmann on 11/28/16.
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

    public String getName() {
        return name;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public Double getGPA() {
        return GPA;
    }

    public Integer getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public boolean equals(Student in) {
        if (this.getID() == in.getID()) return true;
        else {
            return false;
        }
    }

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


