import java.util.Scanner;

public class NumberOfOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pleaase enter the String : ");
        String myString = sc.nextLine();
        System.out.println("please enter the word: ");
        String myWord = sc.nextLine();
        System.out.println("please choose which method ");
        System.out.println("for method One type 1 ");
        System.out.println("for method Two type 2 ");

        int choice=sc.nextInt();

        switch (choice){
            case 1:
                System.out.println(countToken_1(myString,myWord));
                break;
            case 2:
                System.out.println(countToken_2(myString,myWord));
                break;
            default:
                System.out.println("You entered wrong number");
                break;
        }
    }

    //split string and store it inside array, then count the occurence of the word inside this array
    public static int countToken_1(String myString,String myWord){
        int count=0;
        String str[];
        str =myString.split(" ");
        for (String w:str) {
            if (w.equals(myWord)) {
                count++;
            }
        }
       return count;
    }

    //replace every occurence of the word with an empty string then count ,repeat untill no occurences left.
    public static int countToken_2(String myString, String myWord){
        int count=0;
        while (myString.contains(myWord)){
            count++;
            myString = myString.replaceFirst(myWord,"");
        }
       return count;
    }
}
