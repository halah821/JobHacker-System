import java.util.Scanner;
import java.util.StringTokenizer;

public class MyStringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        String myWord = sc.nextLine();
        int count=0;

        StringTokenizer st = new StringTokenizer(myString," ");
        while (st.hasMoreTokens()) {
            if (st.nextToken().equals(myWord)){
                count++;
            }
        }
        System.out.println(count);
    }
}
