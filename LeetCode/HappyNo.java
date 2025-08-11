public class HappyNo {
    public static void main(String[] args) {
        int a=7,sum=0 , n=a;
        while (n>9) {
            a=n;
            sum=0;
            while (a!=0) {
                int d=a%10;
                sum = sum+(d*d);
                a=a/10; 
            }
                n=sum;
        }
        if (n==1) {
            System.out.println("true :"+sum);
        }else{
            System.out.println(sum);
        }
    }
}
