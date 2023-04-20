import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String reverse = new String();

        int length =word.length();
         for (int i=0; i<length;i++){
             reverse+=word.charAt(length-1-i);
         }
         if (word.equalsIgnoreCase(reverse)){
                 System.out.println("palindrome");

             }else {
             System.out.println("not palindrome");
         }
    }
}
