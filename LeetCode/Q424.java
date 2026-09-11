import java.util.HashMap;

public class Q424 {
    public static void main(String[] args) {
        String s = "ABAB";
        int l = 0, r = 0, max = 0, mf = 0, k = 2;
        int a[] = new int[26];
        while (r < s.length()) {
            a[s.charAt(r) - 'A']++;
            mf = Math.max(mf, a[s.charAt(r) - 'A']);
            while ((r - l + 1) - mf > k) {
                a[s.charAt(l) - 'A']--;
                mf = 0;
                for (int i = 0; i < 26; i++) {
                    mf = Math.max(mf, a[i]);
                }
                l++;
            }
            if ((r - l + 1) - mf <= k) {
                max = Math.max(max, r - l + 1);
            }
            r++;
        }
        System.out.println(max);
    }
}
