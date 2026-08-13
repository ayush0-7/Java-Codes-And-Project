import java.util.ArrayList;
import java.util.HashMap;

public class Q442 {
    public static void main(String[] args) {
        int a[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (var i : map.entrySet()) {
            if (i.getValue() > 1) {
                list.add(i.getKey());
            }
        }
        System.out.println(list);
    }
}
