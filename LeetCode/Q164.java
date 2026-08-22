import java.util.Arrays;

/**
 * Q164
 */
public class Q164 {

    public static void main(String[] args) {
        int ar[] = {3,6,9,1};
        Arrays.sort(ar);
        int max = 0;
        for (int i = 0; i < ar.length-1; i++) {
            if (((Math.abs(ar[i]-ar[i+1])) > max)) {
                max = Math.abs(ar[i]-ar[i+1]);
            }
        } 
        System.out.println(max);
    }
}