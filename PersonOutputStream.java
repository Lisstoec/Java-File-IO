import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonOutputStream{

    public static void personWriter(Person name) throws IOException {
        File file = new File("Person.txt");

        FileWriter fw;
        try {
            fw = new FileWriter(file);
            fw.write(name.getName());
            fw.write(" ");
            fw.write(Integer.toString(name.getAge()));
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }

}