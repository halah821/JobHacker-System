import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        sumTwoIntegers();
    }
    public static void sumTwoIntegers(){
        int x=0,y=0,sum=0;
        System.out.println("please inter Two Integers");
        Scanner sc = new Scanner(System.in);
        try {
            x = sc.nextInt() ;
            y = sc.nextInt() ;
            sum= x+y;
            System.out.println("the sum is = "+sum);
        }catch (Exception e){
            System.out.println("Error : incorrect Input ");
            sumTwoIntegers();
        }
    }
}
