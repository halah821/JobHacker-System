package com.pattern;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
        double radius = sc.nextDouble();
        double area= n*Math.pow(radius,2);
        System.out.printf("A=%.4f\n",area);
    }
}
