import java.util.Scanner;

//Your job in this problem is to read a number that is a column of an array where an operation will be performed,
// an uppercase character, indicating the operation to be performed and all elements of a bidimentional array M[12][12].
// Then, you have to calculate and print the sum or average of all elements within the green area according to the case.
// The following figure illustrates the case when is entered the number 5 to the array column,
// showing all elements that must be considered in the operation.
//https://www.beecrowd.com.br/judge/en/problems/view/1182

public class ColumnInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double avg =0,sum=0;
        Double[][] myArray = new Double[12][12];
        int c = sc.nextInt();
        char operation = sc.next().charAt(0);

        //fill Array with values from user
        for (int i=0;i<12;i++){
            for (int j=0;j<12;j++){
                myArray[i][j]=sc.nextDouble();
            }
        }
        switch (operation){
            case 'S':         //S for sum
                for (int i=0;i<12;i++){
                    sum += myArray[i][c];
                }
                System.out.printf("%.1f\n",sum);
                break ;
            case 'M':       //M for Median
                for (int i=0;i<12;i++){
                    avg += myArray[i][c];
                }
                avg /=12;
                System.out.printf("%.1f\n",avg);
                break ;
            default:
                System.out.printf("please enter right choice S or M");
                break;
        }
    }
}
