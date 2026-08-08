
public class count_one {
    public static void main(String[] args) {
        int a[] = {1,1,0,1,1,1};
        int c=0,max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                  c++;
                if (max < c) {
                    max=c;
                }
            }
            else {
                c=0;
            }
        }
        System.out.println(max);
    }
}
