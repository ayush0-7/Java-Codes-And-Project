import java.util.HashMap;

public class first_non_repeating_ele {
    public static void main(String[] args) {
        int a[]={4, 5, 1, 2, 1, 4, 5};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i : a) {
             mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for (int i : a) {
            if (mp.get(i)==1) {
                System.out.println(i);
                break;
            }
        }
    }
}
