package Task3.ch11;



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


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Triangle triangle;
        Scanner sc = new Scanner(System.in);

        System.out.println("please Enter the 1st side of the triangle:");
        int side1 = sc.nextInt();
        System.out.println("please Enter the 2nd side of the triangle:");
        int side2 = sc.nextInt();
        System.out.println("please Enter the 3rd side of the triangle:");
        int side3 = sc.nextInt();
        sc.nextLine();
        System.out.println("please Enter the color of the triangle:");
        String color = sc.nextLine();
        System.out.println("please type 'true' if the triangle is filled" +
                " and 'false' if it is not filled");
        boolean isFilled = sc.nextBoolean();

        triangle = new Triangle(side1,side2,side3);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        System.out.println("the area of triangle is: "+triangle.getArea()+
                " ,the perimeter is: " +triangle.getPerimeter()+
                " ,the color is: "+triangle.getColor()+
                " ,isFilled is: "+triangle.isFilled());

    }

}
