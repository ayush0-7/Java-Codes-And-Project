public class Q1351 {
    public static void main(String[] args) {
        int a[][] = {{4,-3,2,-1},{3,2,1,-1}};
        int neg=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j]<0) {
                    neg ++;
                }
            }
            
        }
        System.out.println(neg);
    }
}
