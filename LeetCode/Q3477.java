import java.util.HashMap;

public class Q3477 {
    public static void main(String[] args) {
        int f[] = { 4, 5, 2 };
        int b[] = { 3, 5, 4 };
        HashMap<Integer,Boolean>mp = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            mp.put(b[i], false);
        }
        for (int i = 0; i < f.length; i++) {
            for (var el : mp.entrySet()) {
                if (el.getKey() >= f[i] && el.getValue() != true) {
                    mp.put(el.getKey(), true);
                    break;
                }
            }
        }
        int c=0;
        for (var el : mp.entrySet()) {
            if (el.getValue()==false) {
                c++;
            }
        }
        System.out.println(c);
    }
}
