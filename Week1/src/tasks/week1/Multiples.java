package com.pattern;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if ((B % A) != 0 && (A%B)!=0) {
            System.out.printf("Nao sao Multiplos\n");
        } else {
            System.out.printf("Sao Multiplos\n");
        }
    }

}
