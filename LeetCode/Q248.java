import java.util.Arrays;

public class Q248 {
    public static void main(String[] args) {
        String a="anagram",b="nagaram";
        char s[]= a.toCharArray();
        char st[] = b.toCharArray();
        Arrays.sort(s);
        Arrays.sort(st);
        a = String.valueOf(s);
        b = String.valueOf(st);
        if (a.equals(b)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
