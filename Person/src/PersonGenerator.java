import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonGenerator {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        Scanner pipe = new Scanner(System.in);
        String ID;
        String firstName;
        String lastName;
        String title;
        int YoB;
        int count = 0;

        while (true) {
            if (count == 0) {
                ID = SafeInput.getNonZeroLenString(pipe, "Enter ID Number: ");
                firstName = SafeInput.getNonZeroLenString(pipe, "Enter First Name: ");
                lastName = SafeInput.getNonZeroLenString(pipe, "Enter Last Name: ");
                title = SafeInput.getNonZeroLenString(pipe, "Enter Title: ");
                YoB = SafeInput.getRangedInt(pipe, "Enter a birth year between, ", 1000, 9999);
                Person person = new Person(ID, firstName, lastName, title, YoB);
                list.add(person);
                count++;
            }//end if
            else if (count != 0) {
                boolean YN = SafeInput.getYNConfirm(pipe, "Do you have more data to enter? ");
                if (YN) {
                    ID = SafeInput.getNonZeroLenString(pipe, "Enter ID Number: ");
                    firstName = SafeInput.getNonZeroLenString(pipe, "Enter First Name: ");
                    lastName = SafeInput.getNonZeroLenString(pipe, "Enter Last Name: ");
                    title = SafeInput.getNonZeroLenString(pipe, "Enter Title: ");
                    YoB = SafeInput.getRangedInt(pipe, "Enter a birth year between, ", 1000, 9999);
                    Person persons = new Person(ID, firstName, lastName, title, YoB);
                    list.add(persons);
                }//end if
                else if (!YN) {
                    System.out.println("\n");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }//end elseif
                    break;
                }//end elseif
            }//end while

        }//end outer while
        File workingDirectory = new File(System.getProperty("user.dir"));
        Path file = Paths.get(workingDirectory.getPath() + "\\src\\PersonTestData.csv");

        try
        {
            // Typical java pattern of inherited classes
            // we wrap a BufferedWriter around a lower level BufferedOutputStream
            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            // Finally can write the file LOL!

            for(Person rec : list)
            {
                writer.write(rec.toCSVDataRecord());  // stupid syntax for write rec
                // 0 is where to start (1st char) the write
                // rec. length() is how many chars to write (all)
                writer.newLine();  // adds the new line
            }
            writer.close(); // must close the file to seal it and flush buffer
            System.out.println("Data file written!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }//end main
}
