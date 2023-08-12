
import java.util.*;

public class LinkedHashSetTask {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter number of test cases you want");
        int testCases = sc.nextInt();

        for (int i = 0; i<testCases;i++){

            System.out.println("please enter number of queries you want in the "+ (i+1) +" test case");
            int numberOfQueries = sc.nextInt();
            sc.nextLine();

            for (int j=0;j<numberOfQueries;j++){

                System.out.println("please choose which query to execute" );
                System.out.println("-To insert an element x enter 'a' followed by the element as in 'a x' :");
                System.out.println("-To print the contents of the LinkedHashSet in increasing order enter 'b':");
                System.out.println("-To erase an element x enter 'c' followed by the element as in 'c x' :");
                System.out.println("-To print 1 if the element x is present in the LinkedHashSet or print -1 if not, enter 'd' followed by the element as in 'd x' :");
                System.out.println("-To print the size of the LinkedHashSet enter 'e' :");
                System.out.println("-To print the contents of the LinkedHashSet in insertion order enter 'f':");

                String input =sc.nextLine();
                char query =input.charAt(0);
                String element = null;
                switch (query){
                    case 'a':
                        element=input.substring(2); // substring from the third letter , after the a and the space
                        linkedHashSet.add(Integer.parseInt(element));
                        break;
                    case 'b':
                        TreeSet<Integer> treeset = new TreeSet<>(linkedHashSet);
                        System.out.println(treeset);
                        break;
                    case 'c':
                        element=input.substring(2);   // substring from the third letter , after the c and the space
                        linkedHashSet.remove(Integer.parseInt(element));
                        break;
                    case 'd':
                        element=input.substring(2);   // substring from the third letter , after the d and the space
                        if (linkedHashSet.contains(Integer.parseInt(element))){
                            System.out.println(1);
                        }else {
                            System.out.println(-1);
                        }
                        break;
                    case 'e':
                        System.out.println(linkedHashSet.size());
                        break;
                    case 'f':
                        System.out.println(linkedHashSet);
                        break;
                }
            }
        }
    }
}
