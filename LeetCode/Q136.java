public class Q136 {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,3};
        int unique = 0;
        for (int i = 0; i < a.length; i++) {
            unique ^=a[i];
        }
        System.out.println(unique);
    }
}
