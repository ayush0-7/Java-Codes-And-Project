import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int a[] = { -1, 0, 1, 2, -1, -4 };
        Arrays.sort(a);
        ArrayList<List<Integer>> set = new ArrayList<>();
        for (int i = 0; i < a.length - 2; i++) {
            int l = i + 1;
            int r = a.length - 1;
            while (l < r) {
                int s = a[i] + a[l] + a[r];
                if (s == 0) {
                    if (!set.contains(Arrays.asList(a[i], a[l], a[r]))) {
                        set.add(Arrays.asList(a[i], a[l], a[r]));
                    }
                    l++;
                    r--;
                } else if (s < 0) {
                    l++;
                } else
                    r--;
            }
        }
        System.out.println(set);
    }
}
