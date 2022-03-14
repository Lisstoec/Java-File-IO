import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Person jessica = new Person ("Jessica", 21);
        File file = new File ("./Person.txt");

        Person anna = new Person ("Anna", 21);
        Person berta = new Person ("Berta", 69);
        Person carola = new Person ("Carola", 51);
        Person sonja = new Person ("Sonja", 44);
        Person peter = new Person ("Peter", 32);
        Person markus = new Person ("Markus", 28);
        Person micha = new Person ("Micha", 41);
        Person philipp = new Person ("Philipp", 18);
        File team = new File ("./BadmintonClub.txt");


        System.out.println("Write and read a person to/from a file:");
        
        try {
            PersonOutputStream.personWriter(jessica);
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
               
        try {
            PersonInputStream.personReader(file);
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }

        List<Person> badmintonClub = new ArrayList<Person>();
        badmintonClub.add(anna);
        badmintonClub.add(berta);
        badmintonClub.add(carola);
        badmintonClub.add(sonja);
        badmintonClub.add(peter);
        badmintonClub.add(markus);
        badmintonClub.add(micha);
        badmintonClub.add(philipp);

        System.out.println("Write and read a team to/from a file:");
        try {
            TeamOutputStream.teamWriter(badmintonClub);
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }

        try {
            TeamInputStream.teamReader(team);
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }

    }
}