public class Series1 {
    public static void main(String args[]){

        int s=1,c=1,k=1,a=0;
        for(int i=1;i<=8;i++){
            System.out.print(s+",");
            c = (2 * k) + a;
            s = s+c;
            a+=2;
            k++;
        }
    }
}
