import java.util.Scanner;


//https://www.beecrowd.com.br/judge/en/problems/view/1177


public class ArrayFill_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =0;
        t=sc.nextInt();
        /*if(t< 2||t>50){
            System.out.printf("please enter number between 2 & 50");
            t =sc.nextInt();
        }*/
        int[] vectorN=new int[1000];
        int i=0;
        while(i<1000){
            for(int j=0;j<t;j++){
                if(i<1000) {
                    vectorN[i] = j;
                    i++;
                }
            }
        }
        for(int index=0;index<1000;index++) {
            System.out.printf("N["+index+"] = "+vectorN[index] + "\n");
        }
    }
}
