import java.util.*;

public class Next_Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i,m=0,c=0;
        n=in.nextInt();
        m=n+1;
        for(i=n+1;i<=m;i++){
            c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    c++;
            }
            if (c == 2) {
                
                System.out.println("Next Prime "+i);
                break;
            }
            else{
            m++;
            }
        }
    }
}