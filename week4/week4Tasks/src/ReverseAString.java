import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String reverse = new String();

        int length =word.length();   //length of word
        for (int i=0; i<length;i++){
            reverse +=word.charAt(length-1-i);
        }

        System.out.println(reverse);
    }
}
