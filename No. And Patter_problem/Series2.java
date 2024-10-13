import java.util.*;
public class Series2{
public static void main(String args[] ) {
    
    int s=0,c=2;
    for(int i=1;i<=8;i++){
        System.out.print(s+",");
        s=0;
        s=(int)Math.pow(c,3)-1;
        c++;
    }
    }
}