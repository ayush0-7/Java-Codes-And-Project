public class Q2108 {
    boolean reverse(String st){
       int left =0;
       int right = st.length()-1;
       while (left<right) {
        if (st.charAt(left)==st.charAt(right)) {
            left++;
            right--;
        }
        else{
            return false;
        }
       }
       if (left == right) {
        return true;
       }else
       return false;
    }
    void find(String arr[]){
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (reverse(arr[i])) {
                System.out.println("Truee: "+arr[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        String st[]={"pp","abc","car","ada","racecar","cool"};
        Q2108 ob = new Q2108();
        ob.find(st);
    }
}
