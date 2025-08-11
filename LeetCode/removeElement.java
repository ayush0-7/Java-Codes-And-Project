public class removeElement {
    public static void main(String[] args) {
       int a[] = {3,2,2,3};
       int rem = 3,k=0;
       for (int i = 0; i < a.length; i++) {
        if (a[i]!=rem) {
            a[k]=a[i];
            k++;
        }
       }
       System.out.println(k);
       for (int i : a) {
        System.out.print(a[i]+",");
       }
    }
}
