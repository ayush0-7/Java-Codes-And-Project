
    import java.io.*;
    public class create_file_with_IOExc {

    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("ayu.txt");
        f.write("Programming in JAVA language\nHello World....!");
        f.close();
        System.out.println("File written successfully.");
    }
}
