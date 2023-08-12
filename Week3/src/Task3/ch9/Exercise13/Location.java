package Task3.ch9.Exercise13;

//(The Location class) Design a class named Location for locating a maximal
//        value and its location in a two-dimensional array. The class contains public data
//        fields row, column, and maxValue that store the maximal value and its indices in
//        a two-dimensional array with row and column as int types and maxValue as a
//        double type.
//        Write the following method that returns the location of the largest element in a
//        two-dimensional array:
//public static Location locateLargest(double[][] a)
//        The return value is an instance of Location. Write a test program that prompts
//        the user to enter a two-dimensional array and displays the location of the largest
//        element in the array. Here is a sample run:
//
//            Enter the number of rows and columns in the array: 3 4
//            Enter the array:
//            23.5 35 2 10
//            4.5 3 45 3.5
//            35 44 5.5 9.6
//            The location of the largest element is 45 at (1, 2)

public class Location {
    public int row,column;
    public double maxValue;

    public Location(Location l) {
        this.row = l.row;
        this.column = l.column;
        this.maxValue =l.maxValue;
    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }
}
