package Task2.week3;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println("please specify array size :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] str = new String[size];
        System.out.println("please enter your "+size+" words :");
        sc.nextLine(); //to skip the line and avoid adding it to the array elements
        //loop to fill Array
        for (int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
        }
        String longestPerfix = getCommonPerfix(str[0],str[1]);
        //loop to find prefix
        for (int i = 0;i<str.length;i++){
            if(longestPerfix!=null){//if you have a first value for longest prefix to compare, then compare
                longestPerfix =getCommonPerfix(longestPerfix,str[i]);
            }else if (longestPerfix==null&&i<str.length-1){
                //else compare two elements of the array until you reach
                // the one before the last element and compare with last element
                longestPerfix =getCommonPerfix(str[i],str[i+1]);
            }
        }
        //print if not null else print message
        if(longestPerfix!=null) {
            System.out.println(longestPerfix);
        }else {
            System.out.println("There is no common prefix among the input strings");
        }
    }
    public static String getCommonPerfix(String s1,String s2) {
        String perfix = null;
        for (int j = 1; j < s2.length(); j++) {
            if (s1.startsWith(s2.substring(0, j))) {
                perfix = s2.substring(0, j);
            }
        }
        return perfix;
    }
}
