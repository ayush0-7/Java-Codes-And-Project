public class Q7 {
    public static void main(String[] args) {
         int a=123,rev =0;
        if (a>Math.round(Math.pow(2,31))-1 || a>(-Math.round(Math.pow(2, 31)))) {
            System.out.println(false);
        }
       else{
        while (a!=0) {
            int d=a%10;
            rev = rev * 10+d;
            a/=10;
        }
        System.out.println(rev);
       }
    }
}
