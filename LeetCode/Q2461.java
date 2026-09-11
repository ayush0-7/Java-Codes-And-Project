import java.util.*;

public class Q2461 {
    public static void main(String[] args) {
        int a[] = { 1, 5, 4, 2, 9, 9, 9 };
        int r = 0, l = 0, k = 3;
        long s = 0,max = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        while (r < a.length) {
            s += a[r];
            mp.put(a[r], mp.getOrDefault(a[r], 0) + 1);
            if ((r - l + 1) == k) {
                System.out.println(mp);
                if (mp.size() == k) {
                    max = Math.max(max, s);
                }
                s = s - a[l];
                int value = a[l];
                int frequency = mp.get(value);

                if (frequency == 1) {
                    mp.remove(value);
                } else {
                    mp.put(value, frequency - 1);
                }
                l++;
            }
            r++;
        }
        System.out.println(max);
    }
}
