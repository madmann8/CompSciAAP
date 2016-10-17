package ObjectNotes;


public class Test {
    public static void main(String[] args) {
        Student stud1= new Student("Ben",10);
        Student stud2 = new Student ("Will",10);
        Student stud3 = new Student ("Shelby");
        System.out.println(stud1);
        Student stud4 = stud3;
        if (stud1.equals (stud2))
            System.out.println ("Students stud1 and stud2 are equal");
        else
            System.out.println ("Students stud1 and stud2 are NOT equal");
        if (stud1.equals (stud3))
            System.out.println ("Students stud1 and stud3 are equal");
        else
            System.out.println ("Students stud1 and stud3 are NOT equal");
        if (stud1 == stud2)
            System.out.println ("Students stud1 and stud2 are ==");
        else
            System.out.println ("Students stud1 and stud2 are NOT ==");
        if (stud3 == stud4)
            System.out.println ("Students stud3 and stud4 are ==");
        else
            System.out.println ("Students stud3 and stud4 are NOT ==");


    }
}
