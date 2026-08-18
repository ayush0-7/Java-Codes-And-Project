public class Q540 {
    public static void main(String[] args) {
        int a[] = {1,1,2,3,3,4,4,8,8};
        int l = a.length;
        if (l == 1) {
            System.out.println(a[0]);
        }
        if (a[0] != a[1]) {
            System.out.println(a[0]);
        }
        if (a[l-1] != a[l-2]) {
            System.out.println(a[l-1]);
        }
        for (int i = 1; i < a.length-1; i++) {
            if (a[i-1] != a[i] && a[i] != a[i+1]) {
                System.out.println(a[i]);
            }
        }
    }
}
