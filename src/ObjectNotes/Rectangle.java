package ObjectNotes;

/**
 * This is a rectangle class that holds value that represnts the length and width and contains
 * methods to represent the perimeter and area of the rectangle.
 */
public class Rectangle {
        private int length;
        private int width;
//Constructor that sets values provided two are given
public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
        }
//Constructor that sets values to 0 provided that none  are given

public Rectangle() {
    this.length = 0;
    this.width = 0;
}
//Returns length of rectangle
public int getLength(){
        return length;
        }
//Sets length of rectangle
public void setLength(int length){
        this.length=length;
        }
// Returns width of rectangles
public int getWidth(){
        return width;
        }
//Sets width of rectangles
public void setWidth(int width){
        this.width=width;
        }
//Returns String of length and width
public String toString(){
        return"Length: "+length+
        "\n"+"Width: "+width;
        }
//Determines of two Recatngles are equvilant based on width and length
public boolean equals(Rectangle rect){
        if(length!=rect.length)return false;
        return width==rect.width;
        }
//Returns calculated area
public int area(){
        return length*width;
        }
//    Returns calculated perimeter
public int perimerter(){
        return(length*2)+(width*2);
        }


        }
