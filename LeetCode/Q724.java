
public class Q724 {
    public static void main(String[] args) {
        int a[] = {1,7,3,6,5,6};
        int sl = 0,sr =0;
        int s=0;
        for (int i = 0; i < a.length; i++) {
            s+=a[i];
        }
        for (int i = 0; i < a.length; i++) {
            sr = s - sl - a[i];
            if (sr == sl) {
                System.out.println(i);
                return;
            }
            sl+=a[i];
        }
        System.out.println(false);
    }
}
