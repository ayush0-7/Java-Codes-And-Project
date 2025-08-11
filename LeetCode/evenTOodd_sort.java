public class evenTOodd_sort {
    boolean even(int a){
        if (a%2==0) {
            return true;
        }else{
            return false;
        }
    }
    void swap(int a[],int left ,int right){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
    void check(int a[]){
        int left =0,right=a.length-1;
        while (left<right) {
            if (even(a[left])==false && even(a[right])== true) {
                swap(a, left, right);
                right--;left++;
            }
            if (even(a[left])==true) {
                left++;
            }
            if (even(a[right])==false) {
                right--;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int []a={8,7,3,6,10};
        evenTOodd_sort ob = new evenTOodd_sort();
        ob.check(a);
    }
}