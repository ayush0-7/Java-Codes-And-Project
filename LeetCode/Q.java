public class Q {
    public static void main(String[] args) {
        int a[] = {3,1,2,3};
        int l=0,r=a.length;
        int min = r;
        int t=1;
        int mid=0;
       while (l<r) {
            mid = l+(r-l)/2;
            if (a[mid] >= t) {
                r = mid-1;Q33
            }else{
                l = mid+1;
            }
        }
        System.out.println(l%a.length);
    }
}
