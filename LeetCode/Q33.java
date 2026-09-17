/**
 * Q33
 */
public class Q33 {

    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 0, 1, 2 };
        int l = 0, r = a.length - 1,t=0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (t < a[l] && t < a[mid]) {
                l = mid+1;
            }else if (a[mid] == t) {
                System.out.println(true);
                return ;
            }else{
                r = mid-1;
            }
        }
        System.out.println(false);
    }
}