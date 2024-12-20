import java.util.Scanner;

public class SortWordsByLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine().trim() + " "; 

    
        int wordCount = 0;
        String tempWord = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        String[] words = new String[wordCount];
        int index = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (c != ' ') {
                tempWord += c;
            } else {
                words[index] = tempWord;
                index++;
                tempWord = "";
            }
        }

        
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length() || 
                   (words[i].length() == words[j].length() && words[i].compareTo(words[j]) > 0)) {
                    // Swap words[i] and words[j]
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        
        System.out.println("\nSorted Words by Length:");
        for (String word : words) {
            System.out.println(word);
        }

        in.close();
    }
}
