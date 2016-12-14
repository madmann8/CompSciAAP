package Inheritance;

/**
 * Created by madmann on 12/8/16.
 */
public class Person {
    private int id;
    private String firstName;
    private String  lastName;

    public Person() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
    }
    public Person( String firstName, String lastName,int id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return String.format("%s %s %n%d",firstName,lastName,id);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean equals(Person obj) {
        return id==obj.getId();
    }
}
