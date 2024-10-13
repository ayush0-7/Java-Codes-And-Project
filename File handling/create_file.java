import java.io.*;

public class create_file 
{
    public static void main(String[] args) throws IOException 
    {
        File f=new File("ayu.txt");
        try {
            if(f.createNewFile())
        {
            System.out.println("File created....!");
        }
        else
        System.out.println("file exist already");
        } catch (Exception e) {
            System.out.println("An error occured");
        }
    }
}
