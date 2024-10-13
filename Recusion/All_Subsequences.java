public class All_Subsequences {
    public static void sub(String s,String st,int c){
        if (s.length()==c) {
            System.out.println(st);
            return;
        }
        sub(s, s.charAt(c)+st, c+1);

        sub(s, st, c+1);
    }
    public static void main(String[] args) {
        sub("abc", "", 0);
    }
}
