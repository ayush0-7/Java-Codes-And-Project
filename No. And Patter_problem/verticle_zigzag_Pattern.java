import java.util.*;
class verticle_zigzag_Pattern
{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=13;i++){
            for(j=1;j<=3;j++){
                if(i==j||(i+j)==6||(i+j)==10||(i+j)==14||((i+j)==8&&(i-j==4))||((i+j)==12&&(i-j==8)))
                System.out.print("*");
                else
                System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}