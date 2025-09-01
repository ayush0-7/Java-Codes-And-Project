
public class Q414 {

    public static void main(String[] args) {
        int a [] = {1,1,2},k=0;
        
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]<a[j]) {
                    int t = a[i];
                    a[i]= a[j];
                    a[j] = t;
                }
            }
        }
        int max = a[0];
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]!=a[i+1]) {
                a[k++] = a[i];
            }
        }
         a[k++] = a[a.length - 1];
         for (int i = 0; i < k; i++) {
            System.out.println(a[i]); 
         }
        if (k>=3) {
            System.out.println(a[2]);
        }else{
            System.out.println(max);
        }
    }
}