import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Files {
  public static void main(String[] args) throws IOException{
    File f=new File(".\\File.txt");
    if(f.exists())
        f.delete();//it delete the file
    else
      f.createNewFile();//to create the new files
    System.out.println(f.isHidden());//check the file is hidden or not
   // System.out.println(f.canWrite());//checks the file is Readonly mode
    //f.setWritable(true);//change the file into readonly mode
  //  System.out.println(f.canWrite());
    f.setWritable(false);//change the file into read  mode
    System.out.println(f.canWrite());

   //creating foloders
   File f1=new File("F:\\roshan\\prsad\\");
   f1.mkdirs();
   File f2=new File("R:\\Movies");
   String str[]=f2.list();
   for(int i=0;i<str.length;i++)
  System.out.println(str[i]);//it give the path of the folders

  System.out.println(Arrays.toString(f2.listFiles()));//it gives the files in that folder

    System.out.println(f.getAbsolutePath());//gets the absolute path
    System.out.println(f.getName());//gets the file name
    System.out.println(f.getParentFile());//gets the parent file
    
    File f3=new File(f2.getParent()+"/resource.txt");//create the file within the foldr
    f3.createNewFile();//create the file
    System.out.println(f3.exists());//checks exists or not
    System.out.println(new Date(f3.lastModified()));//gets the last modified date
    System.out.println(f2.isDirectory());//checks is dir or not
    System.out.println(f2.isFile());//checks is fileis not



  }
  
}
