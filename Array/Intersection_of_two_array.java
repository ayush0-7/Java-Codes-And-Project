import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Intersection_of_two_array {
    public static void main(String[] args) {
        int a[] = {1,2,2,1};
        int b[] = {2,2};
        HashSet<Integer> mp = new HashSet<>();
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
           mp.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (mp.contains(b[i])) {
                list.add(b[i]);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));

    }
}
