package week_4_curriculum.week_4_curriclulum.Activity_1;

import java.io.*;

public class ReaderEx {

    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            Reader r = new FileReader(desktopPath + "/output.csv");
            int readContent = r.read();

            while (readContent != -1){
                System.out.println((char) readContent);
                readContent = r.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}





