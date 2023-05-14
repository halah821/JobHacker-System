package Task2.week3;

import java.util.Scanner;

import static java.lang.System.exit;

public class ValidParentheses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer token =  new StringBuffer();
        token.append(sc.nextLine());
        StringBuffer extraCloseBrackets=new StringBuffer(); //String contain extra close brackets that  has no open brackets
        for (int i = 0; token.length()>0;) {
            switch (token.charAt(i)) {
                case '(':
                    token.deleteCharAt(i);
                    if (token.toString().contains(")")) {
                        int index = token.indexOf(")");
                        token.deleteCharAt(index);
                    }
                    else {
                        System.out.println("False"); //invalid string and close App
                        exit(0);
                    }
                break;
                case '{':
                    token.deleteCharAt(i);
                    if (token.toString().contains("}")) {
                        int index = token.indexOf("}");
                        token.deleteCharAt(index);
                    }
                    else {
                        System.out.println("false");  //invalid string and close App
                        exit(0);
                    }
                    break;
                case'[':
                    token.deleteCharAt(i);
                    if (token.toString().contains("]")) {
                        int index = token.indexOf("]");
                        token.deleteCharAt(index);
                    }
                    else {
                        System.out.println("false"); //invalid string and close App
                        exit(0);
                    }
                    break;
                default:
                    //save closed brackets to another String
                    extraCloseBrackets.append( token.charAt(i));
                    token.deleteCharAt(i);
                    break;
            }

        }
        if(extraCloseBrackets.length()>0){
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }

    }
}
