package com.pattern;

import java.util.Scanner;

public class ArrayChange_I {
    public static void main(String[] args) {
        int swapPosition=19,index=0;
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[20];
        for(int i = 0;i<20;i++){
            numbers[i]=sc.nextInt();
        }
        for (int element:numbers) {
            element=numbers[swapPosition];

            System.out.printf("N["+index+"] = "+element+"\n");
            swapPosition--;
            index++;
        }


    }
}
