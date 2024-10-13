import java.io.*;


public class file_Information
{
    public static void main(String[] args) {
        File f=new File("ayu.txt");
        if(f.exists())
        {
            System.out.println("File Name : "+f.getName());
            System.out.println("File Location : "+f.getAbsolutePath());
            System.out.println("File Writable : "+f.canWrite());
            System.out.println("File Readable : "+f.canRead());
            System.out.println("File Sixe : "+f.length());
        } 
    }
}