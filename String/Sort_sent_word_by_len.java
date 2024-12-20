import java.util.Scanner;

public class Sort_sent_word_by_len {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s ,st="",str="",newstr= " ";
        s=in.nextLine();
        s=s+"";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            st+=c;
            if (c == ' ') {
                st = st.trim(); 
                if (newstr.isEmpty()) {
                    newstr = st; // Add the first word
                } else {
                    String tsent = "", wordInSorted = "";
                    boolean inserted = false;

                    for (int j = 0; j <= newstr.length(); j++) {
                        char ch = (j < newstr.length()) ? newstr.charAt(j) : ' ';

                        if (ch != ' ') {
                            wordInSorted += ch; // Build a word from newstr
                        } else {
                            // Compare word lengths and insert
                            if (!inserted && st.length() < wordInSorted.length()) {
                                tsent += st + " ";
                                inserted = true;
                            }
                            tsent += wordInSorted + " ";
                            wordInSorted = "";
                        }
                    }

                    if (!inserted) {
                        tsent += st + " "; // Append at the end if not inserted
                    }

                    newstr = tsent.trim(); // Update sorted sentence
                }

                st = ""; // Reset for the next word
            }
        }

        // Output the sorted sentence
        System.out.println("Sorted sentence by word length:");
        System.out.println(newstr);

        in.close();
    }
}
