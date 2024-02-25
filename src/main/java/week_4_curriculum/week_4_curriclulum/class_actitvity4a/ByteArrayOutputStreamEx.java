package week_4_curriculum.week_4_curriclulum.class_actitvity4a;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx {
    public static void main(String[] args) throws IOException {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        FileOutputStream fr = new FileOutputStream(desktopPath + "/output.txt");

        ByteArrayOutputStream b = new ByteArrayOutputStream();
        b.write(66);
        b.writeTo(fr);
        b.close();

        System.out.println("Successful!!!");
    }
}
