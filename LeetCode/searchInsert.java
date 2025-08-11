public class searchInsert {
    public static void main(String[] args) {
        int a[]={-1,3,5,6};
        int num = 0 ,min =0,max=a.length-1,mid =0,pos=0,last=0;
         while(min<=max) {
            mid = (min + max)/2;
            if (a[mid] == num) {
                System.out.println(mid);
            }
            if (a[mid]>num) {
                max = mid-1;
            }else{
                min = mid +1;
            }
        }
       System.out.println(min);
    }
}
