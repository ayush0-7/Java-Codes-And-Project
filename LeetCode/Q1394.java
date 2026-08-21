import java.util.HashMap;

public class Q1394 {
    public static void main(String[] args) {
        int a[] = {2,2,3,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
        int max = -1;
        for (var el : map.entrySet()) {
           if (el.getKey().equals(el.getValue())) {
                max = Math.max(max, el.getKey());
            }
        }
        System.out.println(max);
    }
}
