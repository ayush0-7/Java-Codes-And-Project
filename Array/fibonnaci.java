
public class fibonnaci {
    public static void main(String[] args) {
        int f[] = new int[20];
        int a = 0, b = 1, sum = 0;
        f[0] = a;
        f[1] = b;

        // 20 no. Store in Array
        for (int i = 0 + 2; i < f.length; i++) {
            sum = a + b;
            f[i] = sum;
            a = b;
            b = sum;
        }

        // Sort the Array
        int t = 0;
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f.length - 1; j++) {
                if (f[j] < f[j + 1]) {
                    t = f[j];
                    f[j] = f[j + 1];
                    f[j + 1] = t;
                }
            }
        }

        //Prime no. in sorted array
        int c = 0;
        int k = 0;
        int p[] = new int[f.length];
        for (int i = 0; i < f.length; i++) {
            c = 0;
            for (int j = 1; j <= f[i]; j++) {
                if (f[i] % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                p[k] = f[i];
                k++;
            }
        }
        System.out.print("Prime numbers in the Fibonacci sequence: ");
        for (int i = 0; i < k; i++) {
            System.out.print(p[i] + " , ");
        }
    }
}
