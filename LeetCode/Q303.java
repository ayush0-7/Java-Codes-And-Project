import java.util.ArrayList;

/**
 * Q303
 */
public class Q303 {
    static int[] pre; 

    static void NumArray(int[] nums) {
        pre = new int[nums.length+1];
       for (int i = 0; i < nums.length; i++) {
        pre[i+1] =  pre[i]+nums[i];       
       }
    }

    static int sumRange(int left, int right) {
        return pre[right+1] - pre[left];
    }

    public static void main(String[] args) {
        int a[] = {-2, 0, 3, -5, 2, -1};
        NumArray(a);
        System.out.println(sumRange(0, 2));
    }
}