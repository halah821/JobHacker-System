package Task3.ch9.Exercise1;

/*
UML class Diagram of class Rectangle
--------------------------------------------------
-                   Rectangle                   -
--------------------------------------------------
-    -width: double                             -
-    -height: double                            -
-------------------------------------------------
-    +Rectangle()                               -
-    +Rectangle(width: double,height: double)   -
-    +getArea(): double                         -
-    +getPerimeter(): double                    -
-    +setHeight(height: double)                 -
-    +setWidth(width: double)                   -
-    +getHeight(): double                       -
-    +getWidth(): double                        -
-------------------------------------------------
*/
public class TestRectangle {
    public static void main(String[] args) {
        //create two objects from rectangle class
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);

        //Display first rectangle
        System.out.println("the first rectangel width is:"+rectangle1.getWidth()+
                ", height is:"+rectangle1.getHeight()+", area is:"+rectangle1.getArea()+
                ", perimeter is:"+rectangle1.getPerimeter());

        //Display second rectangle
        System.out.println("the second rectangel width is:"+rectangle2.getWidth()+
                ", height is:"+rectangle2.getHeight()+", area is:"+rectangle2.getArea()+
                ", perimeter is:"+rectangle2.getPerimeter());
    }
}
