import java.util.Arrays;

public class Q537 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s1 = "1+1i", s2 = "1+1i";
        String[] nums1= s1.split("\\+");
        String[] nums2= s2.split("\\+");
        int a = Integer.parseInt(nums1[0]);
        int b = Integer.parseInt(nums1[1].replace("i", ""));
        int c = Integer.parseInt(nums2[0]);
        int d = Integer.parseInt(nums2[1].replace("i", ""));
        int real = (a*c) - (b*d);
        int img = (b*c) + (a*d);
        sb.append(real);
        sb.append("+");
        sb.append(img);
        sb.append("i");
        System.out.println(sb);
    }
}
