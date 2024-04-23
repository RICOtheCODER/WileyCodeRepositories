package fileprogs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class filewriting {
    public static void main(String[] args) {
        try(OutputStream out=new FileOutputStream("data.txt")){
            String line ="Hello world,this is java here";
            out.write(line.getBytes());



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
