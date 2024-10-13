import java.io.*;
public class Write_in_file {
    public static void main(String[] args)throws IOException {
        try {
             FileWriter f=new FileWriter("ayu.txt");
             try{
                f.write("Programming in JAVA language \n Hello World....! \n I am trying my best for learning coding");
            }
            finally{
                f.close();
            }
            System.out.println("Wrote Sucessfully....!");
        }
            catch (Exception e) {
                System.out.println(e);
            }
    }
}

