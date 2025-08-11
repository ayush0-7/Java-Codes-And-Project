public class merge_sort_array {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 }, nums2[] = { 2, 5, 6 };
        int m = 3, n = 3, c = 0, t = 0, l = 0, p = 0;
        int sum[] = new int[m + n];
        for (int i = 0; i < m + n; i++) {
            if (l < m) {
                sum[c] = nums1[i];
                c++;
                l++;
            } else{
                sum[c]=nums2[p];
                c++;p++;
            }
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length - 1; j++) {
                if (sum[j] > sum[j + 1]) {
                    t = sum[j];
                    sum[j] = sum[j + 1];
                    sum[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
