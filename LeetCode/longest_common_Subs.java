public class longest_common_Subs {
    public static void main(String[] args) {
        String s[] = { "flower","flow","flight" };
        String str = "",lcs="";
        int min = s[0].length();
        for (int i = 0; i < s.length; i++) {
            if (min > s[i].length()) {
                min = s[i].length();
                str = s[i];
            }
        }
        for (int i = 0; i < min; i++) {
            for (int j = i+1; j < min; j++) {
                String newSt = str.substring(i,j);
                boolean match = true;
                for (int l = 0; l < s.length; l++) {
                    if (!s[l].contains(newSt)) {
                        match = false;
                        break;
                    }
                }
                if (match && newSt.length() > lcs.length()) {
                    lcs=newSt;
                }
            }
        }
        if (!lcs.isEmpty()) {
            System.out.println("Long : "+ lcs);
        } else {
            System.out.println("Not Found");
        }
    }
}
