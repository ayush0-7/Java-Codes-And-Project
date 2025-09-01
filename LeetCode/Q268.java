public class Q268 {
    public static void main(String[] args) {
        int a[] = {0,1};
        int n = a.length;
        int actual = 0;
        for (int i = 0; i < a.length; i++) {
            actual+=a[i];
        }
        System.out.println(actual);
        int missing = n*(n+1)/2;
        System.out.println(missing);
        System.out.println(actual - missing);
    }
}
