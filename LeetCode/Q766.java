public class Q766 {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int k=matrix[0][0];
        boolean check = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i==j&&k!=matrix[i][j]) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
