/**
 * Q3232
 */
public class Q3232 {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,10};
        int sd = 0,dd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 10) {
                sd+=a[i];
            }else{
                dd+=a[i];
            }
        }
        if (sd > dd || dd > sd) {
            System.out.println(true);
        }
        else
            System.out.println(false);
    }
}