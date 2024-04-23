package fileprogs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharacterREadiing {
    public static void main(String[] args) {

        //Reading file using character Stream class
        try(Reader read=new FileReader("data.txt")){
            BufferedReader bf=new BufferedReader(read);
            String line="";
            while((line=bf.readLine() )!=null){
                System.out.println(line);
            }

        }catch (IOException ex){
            System.out.println();
        }
    }

}
