package week_4_curriculum.week_4_curriclulum.class_actitvity4a;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderEx {
    public static void main(String[] args) throws Exception{
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        FileReader fr = new FileReader(desktopPath + "/new.csv");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while((i = br.read())!= -1){
            System.out.println((char) i);
        }
        br.close();
        fr.close();
    }
}
