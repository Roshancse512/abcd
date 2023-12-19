import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files1 {
  public static void main(String[] args) throws IOException {

    //using FileOutputStream 
    File f=new File("./courses that i need.txt");
    if(!f.exists())
    f.createNewFile();
    FileOutputStream fos=new FileOutputStream(f);
    String str="JAVA,HTML,CSS,JS,REACT";
    for(char ch:str.toCharArray())
    fos.write((int)(ch));
    fos.flush();
    fos.close();

    //using FileWriter
    File f2=new File("R:\\roshan.txt");
    f2.createNewFile();
    FileWriter f3=new FileWriter(f2);
    String str1="Hello guys";
    f3.write(str1);
    String str2="good mrng";
    
    f3.write(str2);

    f3.close();

    //using buffered writer
    File f4=new File("R:\\prasad.txt");
    BufferedWriter br=new BufferedWriter(new FileWriter(f4));
    String str4="roshan prasad yarramsetti";
    br.write(str4);
    br.close();
   

    //updating the string with exisiting data
    String str5=new String();
    String str6=" ";
    BufferedReader br1=new BufferedReader(new FileReader(f4));
    while((str6=br1.readLine())!=null)
    str5+=str6+"\n";
    String s="Hello guys";
    BufferedWriter bw=new BufferedWriter(new FileWriter(f4));
    bw.write(str5+s);
    bw.close();
    


  }
  
}
