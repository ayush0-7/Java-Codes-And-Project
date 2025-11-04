import java.util.HashMap;

public class most_frequency {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 1, 3, 1, 6, 1, 2 };
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int el : a) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }
        int ans_Key = 0;
        int max = 0;
        for (var el : freq.entrySet()) {
            if (el.getValue() > max) {
                max = el.getValue();
                ans_Key = el.getKey();
            }
        }
        System.out.printf("Max frequency %d : %d \n",ans_Key,max);
    }
}
