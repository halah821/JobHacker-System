package Week1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++)
        System.out.printf(i+" "+(i*i)+" "+(i*i*i)+"\n");
    }
}
