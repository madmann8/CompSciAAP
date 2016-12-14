package Inheritance;

/**
 * Created by madmann on 12/8/16.
 */
public class Employee extends Person {
    private String position;
    private String division;
    private int level;

    public Employee(String firstName, String lastName, int id, String position, String division, int level) {
        super(firstName, lastName, id);
        this.position = position;
        if (level<=20&&level>=1){
            this.level=level;
        }
        this.division = division;
    }


    public Employee() {
        super("", "", 0);
        this.position = "";
        this.division = "";
        this.level = 0;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("%s %s %n%d%nPosition:%s%nDivision:%s%nLevel:%d", getFirstName(), getLastName(), getId(), position, division, level);
    }

    public Boolean equals(Employee in) {
        if (in.getLevel() == getLevel() && getPosition().equals(in.getDivision())) {
            return true;
        } else return false;
    }


}
