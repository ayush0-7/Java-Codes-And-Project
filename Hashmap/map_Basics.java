import java.util.HashMap;

public class map_Basics {
    public static void main(String[] args) {
        HashMap<String ,Integer> mp=new HashMap<>();
        // put 
        mp.put("Ayush", 19); 
        mp.put("Ravi", 80); 
        mp.put("Kartikey", 229); 

        // get 
        System.out.println(mp.get("Ayush"));

        // remove
        System.out.println(mp.remove("Ravi"));
        System.out.println(mp.remove("Modi"));

        // Key is in map or NOT 
        System.out.println(mp.containsKey("Kartikey"));
        System.out.println(mp.containsKey("Ravi"));

        // put if it is not in the map 
        mp.putIfAbsent("Shaily",18);
        mp.putIfAbsent("Kartikey",15);

        // All keys in map 
        System.out.println(mp.keySet());

        // All Values in map 
        System.out.println(mp.values());

        // All entries in map 
        System.out.println(mp.entrySet());

        // Traversing all entries 
        for (var key : mp.keySet()) {
            System.out.printf("Name : %s \n",key);
        }

        for (var e : mp.entrySet()) {
            System.out.printf("Name : %s , Age : %d \n",e.getKey() , e.getValue());
        }
    }
}
