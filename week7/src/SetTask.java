import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetTask {
    public static void main(String[] args) {

        Set<Integer> set;

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter number of test cases you want");
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {

            set = new HashSet<>();

            System.out.println("please enter number of queries you want in the " + (i + 1) + " test case");
            int numberOfQueries = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < numberOfQueries; j++) {

                System.out.println("please choose which query to execute");
                System.out.println("-To insert an element x enter 'a' followed by the element as in 'a x' :");
                System.out.println("-To print the contents of the set in increasing order enter 'b':");
                System.out.println("-To erase an element x enter 'c' followed by the element as in 'c x' :");
                System.out.println("-To print 1 if the element x is present in the Set " +
                        "or print -1 if not, enter 'd' followed by the element as in 'd x' :");
                System.out.println("-To print the size of the Set enter 'e' :");

                String input = sc.nextLine();
                String[] splittedInput = input.split(" ");
                String query = splittedInput[0];
                String element = null;
                switch (query) {
                    case "a":
                        element = splittedInput[1];
                        set.add(Integer.parseInt(element));
                        break;
                    case "b":
                        TreeSet treeSet = new TreeSet<>(set);
                        System.out.println(treeSet);
                        break;
                    case "c":
                        element = splittedInput[1];
                        set.remove(Integer.parseInt(element));
                        break;
                    case "d":
                        element = splittedInput[1];
                        if (set.contains(Integer.parseInt(element))) {
                            System.out.println(1);
                        } else {
                            System.out.println(-1);
                        }
                        break;
                    case "e":
                        System.out.println(set.size());
                        break;
                }
            }
        }
    }
}
