import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.StringTokenizer;

public class CalSumAvgFromFile {
    public static void main(String[] args) {
        File f = new File("resources/Scores.txt"); //my local file Scores.txt
        URL url = null;     //url of online data.
        BufferedReader reader = null;  //to read data from URL
        FileWriter fw = null;
        BufferedWriter writer = null;   //to write data in local file
        try {
            url = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
            reader = new BufferedReader(
                    new InputStreamReader(url.openStream()));
            fw=new FileWriter(f);
            writer =new BufferedWriter(fw);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        String line=null; //to store lines from buffered reader
        while (true){
            try {
                // check if Buffered reader can get more lines //break if it gets null // also close Buffered reader and writer before finishing.
                if (!((line = reader.readLine()) != null)){
                    reader.close();
                    writer.close();
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.write(line);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        calculateSumAndAverage(f);
    }

    private static void calculateSumAndAverage(File f) {
        int sum=0;  //sum of all values inside the file
        int avg=0; //avg of all values inside the file
        int count=0; // number of values inside the files
        String line=null;
        FileReader fr = null;
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr); //to read values from filegit

        while (true){
            try {
                if (!((line=br.readLine())!=null)) {
                    br.close();
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line," ");
            while (stringTokenizer.hasMoreTokens()){
                int x = Integer.parseInt(stringTokenizer.nextToken());
                count++;
                sum+=x;
            }
        }
        try {
            avg =sum/count;
        }catch (ArithmeticException ae){
            System.out.println("Exception: / by zero");
        }

        System.out.println("sum is : "+sum);
        System.out.println("average is : "+avg);
    }
}
