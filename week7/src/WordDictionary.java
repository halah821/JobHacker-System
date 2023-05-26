import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordDictionary {

    public enum Words{
        Ant,Bear,Cup,Duck,Elephant,Fork,Gorilla,Horse,Iguana,Juice,
        Kangaroo,Lion,Monkey,Nest,Octopus,Panda,Queen,Rabbit,Sun,
        Turtle,Uncle,Vet,Wolf,XRay,Yoyo,Zebra
    };
    public enum Alphabets{
        A,B,C,D,E,F,G,H,I,J,
        K,L,M,N,O,P,Q,R,S,
        T,U,V,W,X,Y,Z
    };
    public static void main(String[] args){
        //create map
        Map<Alphabets,String> map=new HashMap<>();

        //fill map
        map.put(Alphabets.A,Words.Ant.toString());
        map.put(Alphabets.B,Words.Bear.toString());
        map.put(Alphabets.C,Words.Cup.toString());
        map.put(Alphabets.D,Words.Duck.toString());
        map.put(Alphabets.E,Words.Elephant.toString());
        map.put(Alphabets.F,Words.Fork.toString());
        map.put(Alphabets.G,Words.Gorilla.toString());
        map.put(Alphabets.H,Words.Horse.toString());
        map.put(Alphabets.I,Words.Iguana.toString());
        map.put(Alphabets.J,Words.Juice.toString());
        map.put(Alphabets.K,Words.Kangaroo.toString());
        map.put(Alphabets.L,Words.Lion.toString());
        map.put(Alphabets.M,Words.Monkey.toString());
        map.put(Alphabets.N,Words.Nest.toString());
        map.put(Alphabets.O,Words.Octopus.toString());
        map.put(Alphabets.P,Words.Panda.toString());
        map.put(Alphabets.Q,Words.Queen.toString());
        map.put(Alphabets.R,Words.Rabbit.toString());
        map.put(Alphabets.S,Words.Sun.toString());
        map.put(Alphabets.T,Words.Turtle.toString());
        map.put(Alphabets.U,Words.Uncle.toString());
        map.put(Alphabets.V,Words.Vet.toString());
        map.put(Alphabets.W,Words.Wolf.toString());
        map.put(Alphabets.X,Words.XRay.toString());
        map.put(Alphabets.Y,Words.Yoyo.toString());
        map.put(Alphabets.Z,Words.Zebra.toString());

        //print All
        printAll(map);

        System.out.println("enter the letter");
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        for (Alphabets letter: Alphabets.values()){
            if(letter.name().equals(s)){
                printWord(map,letter);
            }
        }

    }
    public static void printAll(Map<Alphabets,String> map){
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static void printWord(Map map,Alphabets key){
        System.out.println(map.get(key).toString());
    }
}
