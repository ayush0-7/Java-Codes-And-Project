import java.util.HashMap;

public class word_freq {
    public static void main(String[] args) {
        String s ="java is easy and java is powerful";
        String word[]=s.split(" ");
        System.out.println(word[0]);
        HashMap<String,Integer>mp=new HashMap<>();
       for (String i : word) {
    
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        System.out.println(mp);
    }
}
