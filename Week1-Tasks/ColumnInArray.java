package Week1;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double avg =0,sum=0;
        Double[][] myArray = new Double[12][12];
        int c = sc.nextInt();
        char operation = sc.next().charAt(0);

        for (int i=0;i<12;i++){
            for (int j=0;j<12;j++){
                myArray[i][j]=sc.nextDouble();
            }
        }
        switch (operation){
            case 'S':
                for (int i=0;i<12;i++){
                    sum += myArray[i][c];
                }
                System.out.printf("%.1f\n",sum);
                break ;
            case 'M':
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
