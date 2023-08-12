package Task3.ch9.Exercise6;

import java.util.Random;
import java.util.concurrent.TimeUnit;


/*
UML class Diagram of class Rectangle
--------------------------------------------------
-                   StopWatch                   -
--------------------------------------------------
-    -startTime: Date                           -
-    -endTime: Date                             -
-------------------------------------------------
-    +StopWatch()                               -
-    +getStartTime(): Date                      -
-    +getEndTime(): Date                        -
-    +setStartTime(startTime: Date)             -
-    +setEndTime(endTime: Date)                 -
-    +start()                                   -
-    +stop()                                    -
-    +getElapsedTime(): long                    -
-------------------------------------------------
*/

public class TestStopWatch {
    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        sortArray();

        stopWatch.stop();


        long timeElapsed = stopWatch.getElapsedTime();
        long hours = TimeUnit.MILLISECONDS.toHours(timeElapsed);
        timeElapsed -= (hours * 60 * 60 * 1000);  //convert hours to milliseconds then subtract it from time Elapsed
        long minutes = TimeUnit.MILLISECONDS.toMinutes(timeElapsed);
        timeElapsed -= (minutes * 60 * 1000);  ////convert minutes to milliseconds then subtract it from time Elapsed
        long seconds = TimeUnit.MILLISECONDS.toSeconds(timeElapsed); //the rest will be seconds
        System.out.println("Elapsed time is : " + hours + " hours, and " + minutes + " minutes, and " + seconds + " seconds.");

    }

    public static void sortArray() {
        int number = 100000; //number of elements
        int[] array = new int[number];  //array of 100000

        Random random = new Random(1000);
        for (int i = 0; i < array.length; i++) {
            //fill array with random numbers in range from 0 to 100000
            array[i] = random.nextInt(100000);
        }

        for (int i = 0; i < number - 1; i++) {
            int min=i;
            for (int j = i + 1; j < number; j++) {
                //search for the least element and assign it's index to 'min'
                if (array[j]<array[min]){
                    min = j;
                }
            }

            //swap elements using temp
            int temp =array[i];
            array[i]=array[min];
            array[min]=temp;
        }
    }
}