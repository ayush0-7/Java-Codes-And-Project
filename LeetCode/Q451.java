public class Q451 {
    public static void main(String[] args) {
        String s = "tree";
        char[] a = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (Character.isUpperCase(a[i]) || Character.isUpperCase(a[j])) {
                    a[i] = a[i];
                }
                if (a[i] < a[j]) {
                    char t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println(String.valueOf(a));
    }
}
