public class Q3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int a[] = new int[256];
        int r=0,l=0,max=0;
        while (r < s.length()) {
            a[s.charAt(r)]++;
            while(a[s.charAt(r)] > 1) {
                a[s.charAt(l)]--;
                l++;
            }
            max = Math.max(max, r-l+1);
            r++;
        }
        System.out.println(max);
    }
}
