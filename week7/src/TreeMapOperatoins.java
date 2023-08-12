import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapOperatoins {
    public static void main(String[] args) {

        TreeMap treeMap = new TreeMap();

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter number of test cases you want");
        int testCases = sc.nextInt();

        for (int i = 0; i<testCases;i++){

            System.out.println("please enter number of queries you want in the "+ (i+1) +" test case");
            int numberOfQueries = sc.nextInt();
            sc.nextLine();

            for (int j=0;j<numberOfQueries;j++){

                System.out.println("please choose which query to execute" );
                System.out.println("-To add entry with key x and value y enter 'a' followed by the entry as in 'a x y' :");
                System.out.println("-To print the value of x if present else print -1 enter 'b' followed by the key x as in 'b x':");
                System.out.println("-To print the size of the map enter c :");
                System.out.println("-To remove an entry with key x, enter 'd' followed by the key x as in 'd x' :");
                System.out.println("-To print the map sorted by key enter 'e' :");

                String input =sc.nextLine();
                String[] splittedInput = input.split(" ");
                String query =splittedInput[0];
                String key = null;
                String value = null;
                switch (query){
                    case "a":
                        key=splittedInput[1];
                        value=splittedInput[2];
                        treeMap.put(key,value);
                        break;
                    case "b":
                        key=splittedInput[1];
                        if (treeMap.containsKey(key)){
                            System.out.println(treeMap.get(key));
                        }else {
                            System.out.println(-1);
                        }
                        break;
                    case "c":
                        System.out.println(treeMap.size());
                        break;
                    case "d":
                        key=splittedInput[1];
                        treeMap.remove(key);
                        break;
                    case "e":
                        System.out.println(treeMap);
                        break;
                }
            }
        }
    }
}
