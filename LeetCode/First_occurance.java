public class First_occurance {
    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issi", str = "";
        int a = -1 ,res=0,out=0;
        while (true) {
            a++;  str = "";
            for (int i = a; i < haystack.length(); i++) {
                char c = haystack.charAt(i);
                str += c;
                if (str.trim().length() == needle.length()) {
                    int k = str.trim().length() - i - 1;
                    if (str.equals(needle)) {
                        res = 1 ;
                        out=k;
                        break;
                    }else{
                        break;
                    }
                }
            }
            if (res==1) {
                System.out.println(Math.abs(out));
                break;
            }
        }
    }
}
