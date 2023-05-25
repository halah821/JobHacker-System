package Task2.week3;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String token = new String();
        token = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < token.length(); i++) {
            stack.push(token.charAt(i));
        }

        System.out.println(isValid(stack));
    }

        public static boolean isValid(Stack<Character> stack){
            while (!stack.empty()){
                Character braketOne = stack.pop();
                Character braketTwo = stack.pop();
                if (braketOne==']'&&braketTwo=='['){
                    continue;
                }else if (braketOne=='}'&&braketTwo=='{'){
                    continue;
                }else if(braketOne==')'&&braketTwo=='('){
                    continue;
                }else {
                    return false;
                }
            }
            return true;
        }
}
