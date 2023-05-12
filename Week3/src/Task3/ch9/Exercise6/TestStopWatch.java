package Task3;

import java.util.Date;

import static java.lang.Thread.sleep;

public class TestStopWatch {
    public static void main(String[] args) {

        StopWatch stopWatch =new StopWatch();
        stopWatch.start();
        System.out.println("Started");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopWatch.stop();
        System.out.println("Stopped");
        System.out.println("Elapsed time is : "+stopWatch.getElapsedTime());

    }
}
