import java.util.Arrays;

public class Q628 {
    public static void main(String[] args) {
        int num[] = { 1,2,3,4 };
        Arrays.sort(num);
        int n = num.length;
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        int option1 = num[n - 1] * num[n - 2] * num[n - 3]; // top 3
        int option2 = num[0] * num[1] * num[n-1]; // 2 smallest + largest
        System.out.println(option1 + "     |     " + option2);
        System.out.println(Math.max(option1, option2));
    }
}
