import java.util.Scanner;


//https://www.beecrowd.com.br/judge/en/problems/view/1006

public class Average2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a =sc.nextDouble();
        double b =sc.nextDouble();
        double c =sc.nextDouble();
        double median = ((a*2)+(b*3)+(c*5))/10;
        System.out.printf("MEDIA = %.1f\n",median);
    }
}
