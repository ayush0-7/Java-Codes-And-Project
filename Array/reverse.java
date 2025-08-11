public class reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int start = i;
            int end = n - i - 1;
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        
        System.out.println("Reversed array is: ");
        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
        System.out.println();
    }
}