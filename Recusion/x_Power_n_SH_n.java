//Print x^n (with stack height = n)

public class x_Power_n_SH_n {
    int pow(int x,int n){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        
        int cp = pow(x, n-1);
        int power = x * cp;
        return power;
    }
    public static void main(String[] args) {
        x_Power_n_SH_n ob = new x_Power_n_SH_n();
        int s=ob.pow(2, 5);
        System.out.println(s);
    }
}