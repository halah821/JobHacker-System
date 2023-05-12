package Task3;

import java.util.Date;
import java.util.concurrent.TimeUnit;
//(Stopwatch) Design a class named StopWatch. The class contains:
//        ■■ Private data fields startTime and endTime with getter methods.
//        ■■ A no-arg constructor that initializes startTime with the current time.
//        ■■ A method named start() that resets the startTime to the current time.
//        ■■ A method named stop() that sets the endTime to the current time.
//        ■■ A method named getElapsedTime() that returns the elapsed time for the
//        stopwatch in milliseconds.
//        Draw the UML diagram for the class then implement the class. Write a test program
//        that measures the execution time of sorting 100,000 numbers using selection sort.

public class StopWatch {
    private Date startTime,endTime;

    StopWatch(){
        startTime =new Date();
        endTime = new Date();
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void start(){
        Date current = new Date();
        setStartTime(current);
    }
    public void stop(){
        Date current = new Date();
        setEndTime(current);
    }
    public long getElapsedTime(){
        long timeElapsed = endTime.getTime()-startTime.getTime();
        return TimeUnit.MILLISECONDS.toSeconds(timeElapsed);
        //return timeElapsed;
    }
}
