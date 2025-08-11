public class move_zero {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int pos=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                arr[pos++]=arr[i];
            }
        }
        while (pos<arr.length) {
            arr[pos++]=0;
        }

        // Print the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
