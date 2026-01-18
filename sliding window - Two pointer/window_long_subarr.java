public class window_long_subarr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 10 };
        int k = 9;
        int l = 0, s = 0;
        int e = 0;
        int sum = 0, maxLen = 0, max = 0;
        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];
            while (sum > k) {
                sum -= arr[l];
                l++;
            }
            if ((r - l + 1 > maxLen) ||
                    (r - l + 1 == maxLen && sum > max)) {

                maxLen = r - l + 1;
                max = sum;
                s = l;
                e = r;
            }
        }
        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
        System.out.println(maxLen + "\t" + max);
    }
}
