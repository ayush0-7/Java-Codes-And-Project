public class reverse_String {
    public static void main(String[] args) {
        String a[]={"h","e","l","l","o"};
        int left = 0,right = a.length-1;
        while (left<right) {
           String temp=a[left];
           a[left]=a[right];
           a[right]=temp;
           left++;
           right--; 
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" , ");
        }
    }
}
