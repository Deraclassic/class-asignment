package week_4_curriculum.week_4_curriclulum.class_actitvity4a;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            File file = new File(desktopPath + "/output.csv");
            if(file.createNewFile()){
                System.out.println("new file has been created");
            }else{
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
