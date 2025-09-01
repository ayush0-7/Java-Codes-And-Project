public class Q2460 {
    public static void main(String[] args) {
        int a[] = { 847,847,0,0,0,399,416,416,879,879,206,206,206,272 };
        int left = 0, pos = a.length - 1;
        int right = a.length - 1;
        while (left < right) {
            if (a[left] == a[left + 1]) {
                a[left] = a[left] * 2;
                a[left + 1] = 0;
                left += 2;
            } else {
                left++;
            }
        }
         int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[index++] = a[i];
            }
        }
        while (index < a.length) {
            a[index++] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
