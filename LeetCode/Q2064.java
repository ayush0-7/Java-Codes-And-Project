public class Q2064 {
    static int max(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = { 5, 7 };
        int n = 2;
        int l = 1, r = max(a);
        while (l <= r) {
            int s = 0;
            int mid = l + (r - l) / 2;
            for (int i = 0; i < a.length; i++) {
                s += (a[i] + mid - 1) / mid;
                if (s > n) {
                    break;
                }
            }
            if (s <= n) {
                r = mid - 1;
            } else
                l = mid + 1;
        }
        System.out.println(l);
    }
}
