public class Q1248 {

    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 1, 1 };
        int k = 3;
        int result = atMostK(a, k) - atMostK(a, k - 1);
        System.out.println(result);
    }
    static int atMostK(int[] a, int k) {
        if (k < 0) return 0;
        
        int l = 0, r = 0, s = 0, c = 0;
        while (r < a.length) {
            s += (a[r] % 2);
            while (s > k) {
                s -= (a[l] % 2);
                l++;
            }
            c += (r - l + 1);
            r++;
        }
        return c;
    }
}
