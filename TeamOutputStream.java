import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TeamOutputStream extends PersonOutputStream {

    public static void teamWriter(List<Person> name) throws IOException {
        File file = new File("BadmintonClub.txt");

        FileWriter fw = new FileWriter(file);
        for(Person person : name){
        try {
            fw.write(person.getName());
            fw.write(" ");
            fw.write(Integer.toString(person.getAge()));
            fw.write("\n");
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
        }
        fw.close();
    }
}