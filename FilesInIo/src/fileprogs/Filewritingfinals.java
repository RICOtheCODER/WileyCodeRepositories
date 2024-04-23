package fileprogs;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Filewritingfinals {
    public static void main(String[] args) {
        try(Writer writer=new FileWriter("data.txt",true))//if true not written new file is created
        {
            String line="\n Hello how are ya?";
            writer.write(line);
            writer.append("ARE WE READY?");
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
