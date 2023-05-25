package Task2.week3;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Array size:");
        int arraySize = sc.nextInt();
        System.out.println("num = ");
        int[] myArray = new int[arraySize];
        HashMap<Integer,Integer> hashMap = new HashMap<>();         //to hold pairs of numbers and its indices
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
            hashMap.put(myArray[i],i);
        }

        System.out.println("target: "); //target is a sum of two elements in the array, that you will return the index of them
        int target =sc.nextInt();

        //assume that each input has exactly one solution
        //I'll not use the same element twice.
        for (int i = 0; i < myArray.length; i++){
            int difference=target-myArray[i];
            if (hashMap.containsKey(difference)){
                //pair found
                //check if it is the same element
                if (i==hashMap.get(difference)){
                    continue;
                }else {
                    // print
                    // then break loop
                    System.out.println("[" + i + "," + hashMap.get(difference) + "]");
                    break;
                }
            }
        }
    }
}
