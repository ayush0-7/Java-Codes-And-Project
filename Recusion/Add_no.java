import java.util.Scanner;
public class Add_no {
    static void sumofn(int n ,int sum){
       
        if (n==0) {
           System.out.println(sum);
           return; 
        }
        sum = sum + n;
        sumofn(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        Add_no ob = new Add_no();
        ob.sumofn(n,0);
    }
}