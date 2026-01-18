public class Max_Points_u_Obtain_from_Cards {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 3, 4, 7, 2, 1, 7, 1 };
        int lsum = 0, rsum = 0, s = 0;
        int k = 4;
        int max = 0;
        int r = arr.length - 1;
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        max = lsum;
        for (int i = k - 1; i >= 0; i--) {
            lsum -= arr[i];
            rsum += arr[r--];
            max = Math.max(max, lsum + rsum);
        }

        System.out.println(max);
    }
}
