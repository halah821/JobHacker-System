package com.pattern;

import java.util.Scanner;

public class BelowTheMainDiagonal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double avg =0,sum=0;
        Double[][] myArray = new Double[12][12];
        char operation = sc.next().charAt(0);

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