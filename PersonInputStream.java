import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class PersonInputStream {

    public static void personReader(File name) throws IOException {
        FileReader fr = new FileReader(name);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}