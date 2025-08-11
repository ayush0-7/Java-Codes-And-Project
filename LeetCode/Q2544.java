public class Q2544 {

    public static void main(String[] args) {
        int n = 521;
        int c=0;
        int sum =0,rev =n;
         while (n!=0) {
           rev = rev * 10 + n%10;
            n/=10;
        }
        System.out.println(rev);
        while (rev!=0) {
            if (c%2==0) {
                sum = sum + rev%10;
                rev/=10;
            }else{
                sum = sum - rev % 10;
                rev/=10;
            }
            c++;
        }
        System.out.println(sum);
    }
}