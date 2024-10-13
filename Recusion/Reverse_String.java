public class Reverse_String {
    static void reverse(String s,int c){
        if(c==-1){
            return;
        }
        System.out.print(s.charAt(c));
        reverse(s, c-1);
    }
    public static void main(String[] args) {
        String s="abcd";
        reverse(s,s.length()-1);
    }
}
