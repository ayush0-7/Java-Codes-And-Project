class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length;
        for (int i = l-1; i >= 0; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            if (digits[i]==9) {
                digits[i]=0;
            }
        }
        int[] newNumber = new int[l + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
public class One {

    public static void main(String[] args) {
        Solution ob = new Solution();
        int arr[]={7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int k[]=ob.plusOne(arr);
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i]+" , ");
        }
    }
}