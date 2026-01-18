import java.util.HashMap;

public class two_sum {
    public static void main(String[] args) {
        int a[]={2, 7, 11, 15};
        int target=9;
        HashMap<Integer,Integer> map = new HashMap<>();
         for (int i = 0; i < a.length; i++) {
            int complement = target - a[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                return;
            }
            map.put(a[i], i);
        }
    }
}
