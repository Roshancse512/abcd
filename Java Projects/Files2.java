import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Files2 {
  public static void main(String[] args)throws IOException {
    //using fileinput stream
    File f=new File("R:\\prasad.txt");
    FileInputStream fis=new FileInputStream(f);
    int asciicode;
    while((asciicode=fis.read())!=-1)
    {
      System.out.print((char)asciicode);
    }
    fis.close();

    System.out.println(" ");
    //using Scannner
    File f1=new File("R:\\prasad.txt");
    FileInputStream fis1=new FileInputStream(f1);
    Scanner sc=new Scanner(fis1);
    String text1=new String();
    while(sc.hasNextLine())
    {
      text1+=sc.nextLine()+"\n";
    }
    System.out.println(text1);
    sc.close();
    fis.close();

    // FileReader
    File f3=new File("R:\\files.txt");
    FileReader fr=new FileReader(f3);
    int asci;
    String text=new String();
    while((asci=fr.read())!=-1)
    {
      text+=String.valueOf((char)asci);
    }
    System.out.println(text);
    
    //Buffered reader
    File f4=new File("R:\\roshan.txt");
    BufferedReader br=new BufferedReader(new FileReader(f4));
    System.out.println(br.readLine());
    // or
    String str6=new String();
    String str7=new String();
    while((str7=br.readLine())!=null)
    {
      str6+=str7+"\n";
    }
    System.out.println(str6);
    br.close();


  }
  
}
