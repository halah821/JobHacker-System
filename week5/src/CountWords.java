import java.io.*;
import java.util.StringTokenizer;

public class CountWords {

    public static void main(String[] args) {
        String line=null;
        int count=0;
        File f = new File("resources/Lincoln.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);

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
                stringTokenizer.nextToken();
                count++;
            }
        }
        System.out.println(count);
    }
}
