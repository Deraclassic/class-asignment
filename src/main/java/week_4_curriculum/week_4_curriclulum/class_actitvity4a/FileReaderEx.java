package week_4_curriculum.week_4_curriclulum.class_actitvity4a;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        FileReader fr = new FileReader(desktopPath + "/new.csv");

        int i;
        while ((i = fr.read()) != -1) {
            System.out.println((char) i);
        }
        fr.close();
    }
}
