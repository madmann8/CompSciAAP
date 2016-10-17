package ObjectNotes;

/**
 * Created by madmann on 10/6/16.
 */
public class RectangleDriver {
    public static void main(String[] args) {
//        Uses initializer that sets length and width to 0
        Rectangle rect1 = new Rectangle();
        //        Uses initializer that sets length and width to entered values
        Rectangle rect2 = new Rectangle(2, 4);
        //        Uses initializer that sets length and width to entered values
        Rectangle rect3 = new Rectangle(1, 2);
//        Prints length and width as string
        System.out.println(rect1);
        System.out.println(rect2);
//Prints areas of rectangles
        System.out.println(rect1.area());
        System.out.println(rect2.area());
        //Prints perimeters of rectangles
        System.out.println(rect1.perimerter());
        System.out.println(rect2.perimerter());
        //Determines of rectangles are equal based on length and width
        System.out.println(rect1.equals(rect2));
        System.out.println(rect2.equals(rect3));
//       Prints length of rectangles
        System.out.println(rect1.getLength());
        System.out.println(rect2.getLength());
        //       Prints width of rectangles
        System.out.println(rect1.getWidth());
        System.out.println(rect2.getWidth());
//        Sets length of rectangles
        rect1.setLength(1238371);
        rect2.setLength(992791235);
        //        Sets width of rectangles

        rect1.setWidth(9);
        rect2.setWidth(86862);
//        Prints length and width as string
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
//Prints areas of rectangles
        System.out.println(rect1.area());
        System.out.println(rect2.area());
        //Prints perimeters of rectangles
        System.out.println(rect1.perimerter());
        System.out.println(rect2.perimerter());
        //Determines of rectangles are equal based on length and width
        System.out.println(rect1.equals(rect2));
        System.out.println(rect2.equals(rect3));
//       Prints length of rectangles
        System.out.println(rect1.getLength());
        System.out.println(rect2.getLength());
        //       Prints width of rectangles
        System.out.println(rect1.getWidth());
        System.out.println(rect2.getWidth());

    }
}
