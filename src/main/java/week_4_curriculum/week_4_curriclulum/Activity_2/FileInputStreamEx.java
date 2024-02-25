package week_4_curriculum.week_4_curriclulum.Activity_2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        try {
            FileInputStream fs = new FileInputStream(desktopPath + "/output.csv");

            int data;

            while ((data = fs.read()) != -1) {
                System.out.println((char) data);
            }

            fs.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
