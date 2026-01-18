import java.util.HashMap;

public class dupli_ele {
    public static void main(String[] args) {
        int a[]={1, 2, 3, 2, 4, 1, 5};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i : a) {
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        for (var i : mp.entrySet()) {
            if (i.getValue()>1) {
                System.out.println(i);
            }
        }
    }
}
