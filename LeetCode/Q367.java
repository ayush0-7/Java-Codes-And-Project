public class Q367 {
    public static void main(String[] args) {
        int n = 16;
        int c=1;
        while (true) {
            n=n-c;
            if (n==0) {
                System.out.println(true);
                break;
            }
            if (n<0) {
                System.out.println(false);
                break;
            }
            c=c+2;
        }
    }
}
