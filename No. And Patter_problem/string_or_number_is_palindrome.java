import java.util.*;
public class string_or_number_is_palindrome
{
    boolean word(int n)
    {
        int d,r=0,m;
        m=n;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(m==r)
        return true;
        else
        return false;
    }
    boolean word(String a)
    {
        String s=" ";
        int l=a.length();
        for(int i=l-1;i>=0;i--)
        {
            char ch=a.charAt(i);
            s=s+ch;
        }
        if(s.equals(a))
        return true;
        else
        return false;
    }
   public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        string_or_number_is_palindrome ob=new string_or_number_is_palindrome();
        System.out.println("Enter string");
        String st=in.nextLine();
        st=st.toUpperCase();
        System.out.println("Enter number");
        int p=in.nextInt();
        boolean x=ob.word(p);
        boolean y=ob.word(st);
        System.out.println(x);
        System.out.println(y);
    }
}