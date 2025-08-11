import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int a = sc.nextInt();
        double x= a/2; //Xn
        double sum=1;  // Xn+1
        while (true) {
            sum = 0.5*(x+(a/x));
            if ((x-sum)<=0.0001 || (x-sum)<=0.00001) {
                System.out.println(sum);
                System.out.println(Math.round(sum));
                break;
            }
            else{
                x=sum;
            }
        }
    }    
}
