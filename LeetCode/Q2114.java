import java.lang.reflect.Array;
import java.util.Arrays;

public class Q2114 {
    public static void main(String[] args) {
        String s[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = 0;
        for (String i : s) {
            String w[] = i.split("\\s+");
            if (w.length >  max) {
                max = w.length;
            }
        }
        System.out.println(max);
    }
}
