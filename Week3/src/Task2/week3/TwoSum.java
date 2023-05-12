package tasks.week3;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Array size:");
        int n = sc.nextInt();
        System.out.println("num = ");
        int[] myArray = new int[n];
        for (int i=0;i<myArray.length;i++){
            myArray[i]=sc.nextInt();
        }
        System.out.println("target: "); //target is a sum of two elements in the array, that you will return the index of them
        int target =sc.nextInt();
        //assume that each input has exactly one solution
        //I'll not use the same element twice.
        for (int i=0;i<myArray.length;i++){
            for (int j=i+1;j<myArray.length;j++){
                if(target==myArray[i]+myArray[j]){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }

    }
}
