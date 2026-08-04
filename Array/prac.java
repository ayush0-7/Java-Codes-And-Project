/**
 * prac
 */
public class prac {

    public static void main(String[] args) {
        int s=0,j=0;
        for (int i = 0; i < 5; i++) {
            if (i>j) {
                s++;
            }else{
                for (int k = 0; k < 5; k++) {
                    s--;
                }
            }
        }
    }
}