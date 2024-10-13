import java.util.Scanner;

public class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int d,r=0;
        while (x!=0) {
            d=x%10;
            r=r*10+d;
            x/=10;
        }
        if (a==r) {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        Solution ob= new Solution();
       boolean a= ob.isPalindrome(n);
       System.out.println(a);
    }
}