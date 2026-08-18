import java.util.Hashtable;

public class Q1346 {
    public static void main(String[] args) {
        int a[] = {10,2,5,3};
        Hashtable<Integer,Integer> m = new Hashtable<>();
        for (int i = 0; i < a.length; i++) {
            int d = a[i] * 2;
            if (m.containsKey(d)) {
                System.out.println(true);
                return;
            }else{
                m.put(a[i], 1);
            }
        }
        System.out.println(false);
    }
}
