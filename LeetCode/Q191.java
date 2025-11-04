public class Q191 {
    public static void main(String[] args) {
        int a= 11,count=0;
        String sum="";
        while (a!=0) {
            int d= a%2;
            sum =sum+d;
            if (d==1) {
                count++;
            }
            a/=2;
        }
        System.out.println(sum+"\t"+count);
    }
}
