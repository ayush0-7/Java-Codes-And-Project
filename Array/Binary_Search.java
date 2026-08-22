public class Binary_Search {
    public static void main(String[] args) {
        int ar[] = {1,2,4,6,8,10,11,20};
        int t = 6;
        int l = 0,r=ar.length-1;
        while (l<r) {
            int m = (l+r)/2;
            // if (ar[m] == t) {
            //     System.out.println(true+" "+m);
            //     return;
            // }
             if(ar[m] < ar[m+1]){
                 l= m+1;
            }else
                r = m;
        }
        System.out.println(ar[l]);
    }
}
