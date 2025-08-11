public class removeDuplicates {
    public static void main(String[] args) {
        int a[] = {1,2,2};
        int b[] = new int[a.length];
        int val = a[a.length-1],k=0;
       for (int i = 0; i < a.length; i++) {
         if (a[i]!=val) {
            b[k] = a[i];
            val = a[i];
            k++;
         }
       }
       System.out.println(k);
       for (int i = 0; i < b.length; i++) {
        System.out.println(b[i]);
       }
    }
}
