package ObjectNotes;

/**
 * Created by madmann on 9/23/16.
 */
public class Test {
    public static void main(String[] args){
        Student student1= new Student("Luke", 1237213);
        Student student2= new Student("Mann", 1232213);
        student1.setId(1231);
        student2.setId(123431);
        student2.setName("Foo");
        student1.setName("Bar");
        System.out.println(student1.getName());
        System.out.println(student1.getId());
        System.out.println(student2.getName());
        System.out.println(student2.getId());
    }
}
