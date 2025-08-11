public class Q1089 {

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 }, c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                c++;
            }
        }
        int last = arr.length - 1;
        int j = last + c;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                if (j < arr.length)
                    arr[j] = 0;
                j--;
                if (j < arr.length)
                    arr[j] = 0;
                j--;
            } else {
                if (j < arr.length)
                    arr[j] = arr[i];
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}