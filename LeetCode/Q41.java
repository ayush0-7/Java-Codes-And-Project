import java.util.*;

public class Q41 {
    public static void main(String[] args) {
        int a[] = {1,2,-1,-7};
        HashSet<Integer> mp = new HashSet<>();
        for (int i : a) {
            mp.add(i);
        }
        int k = 1;
        while (mp.contains(k)) {
            k++;
        }
        System.out.println(k);

    }
}
