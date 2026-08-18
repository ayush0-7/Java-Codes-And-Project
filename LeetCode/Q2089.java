import java.util.ArrayList;
import java.util.Arrays;

public class Q2089 {
    public static void main(String[] args) {
        int a[] = {1,2,5,2,3};
        Arrays.sort(a);
        ArrayList<Integer> list = new ArrayList<>();
        int t=2;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
