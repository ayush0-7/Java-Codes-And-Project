import java.util.*;

public class Q219 {
    public static void main(String[] args) {
        int a[] = {1,1};
        int r=0,l=0;
        int k =0;
         HashSet<Integer> li = new HashSet<>();

        while (r < a.length) {

            if (r-l > k) {
                li.remove(a[l]);
                l++;
            }

            if (li.contains(a[r])) {
                System.out.println(true);
                return ;
            }
            li.add(a[r]);
            r++;
        }
        System.out.println(false);
    }
}
