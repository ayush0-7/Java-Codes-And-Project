public class Palindrome_sent {
    public static void main(String[] args) {
        String s= "0P" , s1="" ,s2="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c)) {
                s1=s1+c;
                s2=c+s2;
            }
        }
        System.out.println(s1 +"\n" + s2);
        if (s1.trim().equalsIgnoreCase(s2.trim())) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
