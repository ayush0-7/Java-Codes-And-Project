
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
import java.util.Scanner;

public class Two_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length of the array");
        int len=in.nextInt();
        int a[] = new int[len];
        int arr[]=new int[2];
        System.out.println("Enter number");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter Target");
        int tar = in.nextInt();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] == tar) {
                arr[0]=a[i];
                arr[1]=a[i+1];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}