package com.pattern;

import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalValue = sc.nextInt();
        int n =originalValue;
        int nota100=0,nota50=0,nota20=0,nota10=0,nota5=0,nota2=0,nota1=0;
        while(n>0){
            if(n>=100) {
                n -= 100;
                nota100++;
                continue;
            }
            if(n>=50){
                n -= 50;
                nota50++;
                continue;
            }
            if(n>=20){
                n -= 20;
                nota20++;
                continue;
            }
            if(n>=10){
                n -= 10;
                nota10++;
                continue;
            }
            if(n>=5){
                n -= 5;
                nota5++;
                continue;
            }
            if(n>=2){
                n -= 2;
                nota2++;
                continue;
            }
            if(n>=1){
                n -= 1;
                nota1++;
                continue;
            }
        }
        System.out.printf(originalValue+"\n");
        System.out.printf(nota100+" nota(s) de R$ 100,00\n");
        System.out.printf(nota50+" nota(s) de R$ 50,00\n");
        System.out.printf(nota20+" nota(s) de R$ 20,00\n");
        System.out.printf(nota10+" nota(s) de R$ 10,00\n");
        System.out.printf(nota5+" nota(s) de R$ 5,00\n");
        System.out.printf(nota2+" nota(s) de R$ 2,00\n");
        System.out.printf(nota1+" nota(s) de R$ 1,00\n");
    }
}
