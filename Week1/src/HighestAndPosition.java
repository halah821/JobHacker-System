import java.util.Scanner;

public class HighestAndPosition {
    public static void main(String[] args){
        int highestValue =0,inputPosition=0,index=0;
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        for(int i = 0;i<100;i++){
            numbers[i]=sc.nextInt();
        }
        for (int element:numbers) {
            if(element>highestValue){
                highestValue=element;
                inputPosition=index;
            }
            index++;
        }
        System.out.printf(highestValue+"\n");
        System.out.printf(inputPosition+1+"\n");
    }
}
