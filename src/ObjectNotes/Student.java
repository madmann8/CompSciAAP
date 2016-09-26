package ObjectNotes;

/**
 * Created by madmann on 9/23/16.
 */
public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void add(int x, int y) {
        int answer;
        answer = x + y;
        System.out.println(answer);
    }

    public static void add(Double x, Double y) {
        Double answer;
        answer = x + y;
        System.out.println(answer);
    }
}
