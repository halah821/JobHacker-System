package com.pattern;

import java.util.Scanner;

public class SquareAndCubic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++)
        System.out.printf(i+" "+(i*i)+" "+(i*i*i)+"\n");
    }
}
