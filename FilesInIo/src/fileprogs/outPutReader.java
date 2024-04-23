package fileprogs;

import java.io.*;
import java.util.Scanner;

public class outPutReader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       try(Writer write=new FileWriter("data1.txt",true)) {
           System.out.println("Enter text to be written");
           String line=sc.nextLine();
           write.write(line);
           System.out.println("Want to add more ?");
           String inp=sc.nextLine();
           while(inp.equals("Y")){
               System.out.println("Enter text to be written ");
               write.append(sc.nextLine());
           }
       }
       catch (IOException ex){
           System.out.println(ex.getMessage());
       }
     try(Reader read=new FileReader("data1.txt")){
           Scanner scn=new Scanner(read);
           String line1="";
           System.out.println("COntent of the File is :");
           while((line1=scn.nextLine())!=null){
               System.out.println(line1);

           }
     }
     catch (IOException ex){
         System.out.println(ex.getMessage());
     }
    }
}
