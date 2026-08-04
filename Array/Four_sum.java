import java.util.*;

public class Four_sum {
    public static void main(String[] args) {
        int arr[] = { 1, 0, -1, 0, -2, 2 };
        int left = 0, right = arr.length - 1;
        int target = 0;
        List<List<Integer>> li = new ArrayList<>();
        while (left < right) {
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += arr[i];
            }
            if (sum == target) {
                for (int i = left; i <= right; i++) {
                    li.add(Arrays.asList(arr[i]));
                }
            }
            left++;
            right--;
        }
        System.out.println(li);
    }
}
