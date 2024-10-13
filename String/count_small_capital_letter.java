import java.util.*;
class count_small_capital_letter
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i, l, t = 0, k = 0;
        l = s.length();
        for (i = 0; i < l; i++) {
            int c = s.charAt(i);
            if (c >= 64 && c <= 90) {
                t++;
            }
            if (c >= 97 && c <= 122) {
                k++;
            }
        }
        System.out.println("Capital = "+t+"\t"+"Small = "+k);
    }
}