package Task3.ch9.Exercise4;

import java.util.Random;

//(Use the Random class) Write a program that creates a Random object with seed
//        1000 and displays the first 50 random integers between 0 and 100 using the
//        nextInt(100) method.

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random(1000);


        for (int i=0;i<50;i++){
            // Generate a random value between 0 and 100
            //print the value
            System.out.println(random.nextInt(100));

        }
    }
}
