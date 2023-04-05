package Week1;


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        int oddNumbersCount=0,evenNumbersCount=0,negativeNumbersCount=0,positiveNumbersCount=0;
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0;i<5;i++){
            numbers[i]=sc.nextInt();
        }
        for (int element:numbers) {
            if(element>0){
                positiveNumbersCount++;
            }else if(element<0){
                negativeNumbersCount++;
            }
            if(element%2==0){
                evenNumbersCount++;
            }else{
                oddNumbersCount++;
            }
        }
        System.out.printf(evenNumbersCount+" valor(es) par(es)"+"\n");
        System.out.printf(oddNumbersCount+" valor(es) impar(es)"+"\n");
        System.out.printf(positiveNumbersCount+" valor(es) positivo(s)"+"\n");
        System.out.printf(negativeNumbersCount+" valor(es) negativo(s)"+"\n");
    }
}
