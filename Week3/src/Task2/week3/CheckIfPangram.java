package Task2.week3;

import java.util.Scanner;

public class CheckIfPangram {
    public static void main(String[] args) {
        System.out.println("please enter Statement: ");
        Scanner sc = new Scanner(System.in);
        String statement = sc.nextLine();
        char c ='a';
        while(c<='z'){
            if (statement.contains(Character.toString(c))){
                c++;
                continue;
            }else {
                //"Not pangram"
                System.out.println("false");
                System.exit(0);
            }
        }
        //if you reach here without exiting the app then it is a Pangram
        System.out.println("true");
    }
}
