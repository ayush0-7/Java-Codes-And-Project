public class Q11 {
    public static void main(String[] args) {
        int a[] = { 1,8,6,2,5,4,8,3,7 };
        int left = 0;
        int right = a.length - 1;
        int Maxarea = 0,area =0;
        while (left < right) {
            area =( right-left)*Math.min(a[left], a[right]);
            Maxarea = (int)Math.max(Maxarea, area);
            if (a[left] < a[right]) {
                left++;
            }else
            right--;
        }
        System.out.println(Maxarea);
    }
}
