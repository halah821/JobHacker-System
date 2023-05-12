package Task3;

import java.util.Scanner;

public class TestLocation {

    public static void main(String[] args) {
        System.out.println("Enter number of rows and columns in the array: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        double[][] a = new double[row][column];
        System.out.println("Enter the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j]=sc.nextDouble();
            }
            System.out.println();
        }
        Location location=new Location(locateLargest(a));
        System.out.println("the location of the largest element " + location.maxValue+ " is at (" +location.row+","+location.column+")");
    }

    public static Location locateLargest(double[][] a){
        Location l = new Location(0,0,0);
        for (int i =0;i< a.length;i++){
            for (int j=0;j< a[i].length;j++){
                if(l.maxValue<a[i][j]) {
                    l.setMaxValue(a[i][j]);
                    l.setRow(i);
                    l.setColumn(j);
                }
            }
        }
        return l;
    }
}
