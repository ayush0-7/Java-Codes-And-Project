import java.util.Scanner;

public class Count_Word_occurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = in.nextLine();
        s = s + " ";
        String st = "";
        int k = 0;
        String a[] = new String['k'];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            st += c;
            if (c == ' ') {
                a[k] = st;
                k++;
                st = "";
            }
        }
        for (int i = 0; i < k; i++) {

            if (a[i].equals(" ")) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < k; j++) {
                if (a[i].equals(a[j])) {
                    count++;
                    a[j] = " ";
                }
            }
            System.out.println(a[i] + " : " + count);
        }
    }
}
