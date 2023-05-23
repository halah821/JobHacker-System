import java.util.Scanner;

//Read an uppercase character that indicates an operation that will be performed in an array M[12][12]. Then, calculate
//and print the sum or average considering only that numbers that are below of the main diagonal of the array,
// like shown in the following figure (green area).
//https://www.beecrowd.com.br/judge/en/problems/view/1184


public class BelowTheMainDiagonal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double avg =0,sum=0;
        Double[][] myArray = new Double[12][12];
        System.out.println("please enter S for sum, M for Meadian");
        char operation = sc.next().charAt(0);

        System.out.println("please enter Array values:");
        for (int i=0;i<12;i++){
            for (int j=0;j<12;j++){
                myArray[i][j]=sc.nextDouble();
            }
        }
        switch (operation){
            case 'S':
                for (int i=0;i<12;i++){
                    for (int j=0;j<i;j++){
                        sum += myArray[i][j];
                    }
                }
                System.out.printf("%.1f\n",sum);
                break ;
            case 'M':
                for (int i=0;i<12;i++){
                    for (int j=0;j<i;j++){
                        avg += myArray[i][j];
                    }
                }
                avg /=66;
                System.out.printf("%.1f\n",avg);
                break ;
            default:
                System.out.printf("please enter right choice S or M");
                break;
        }
    }
}