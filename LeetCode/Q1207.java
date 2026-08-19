import java.util.HashMap;
import java.util.HashSet;


public class Q1207 {
    public static void main(String[] args) {
        int ar[] = {1,2,2,1,1,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : ar) {
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        if (map.size() == 1) {
            System.out.println(true);
        }
         HashSet<Integer> set = new HashSet<>(map.values());

        System.out.println(set.size() == map.size());
    }
}
