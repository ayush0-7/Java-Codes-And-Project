import java.util.Arrays;

public class Q1480 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int pre[] = new int[a.length+1];
        for (int i = 0; i < a.length; i++) {
            pre[i+1] = pre[i] + a[i];
            a[i] = pre[i+1];
        } 
        System.out.println(Arrays.toString(a));
    }
}
