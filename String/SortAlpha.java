import java.util.Scanner;

public class SortAlpha

{

    public String sent;

    int n;

    public SortAlpha()

    {

        sent = "";

        n = 0;

    }

    public void acceptsent()

    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence in Uppercase:");

        sent = in.nextLine();

    }

    public void sort(SortAlpha P)

    {

        int i = 0, j = 0;
        String str = P.sent + " ";
        String word = "";
        String words[] = new String[20];
        while (i < str.length())

        {

            if (str.charAt(i) != ' ')

                word += str.charAt(i);

            else {
                words[j++] = word;

                word = "";

            }

            i++;

        }

        int p = j;

        for (i = 0; i < p; i++) {

            for (j = 0; j < (p - 1 - 1); j++) {

                if (words[j].compareToIgnoreCase(words[j + 1]) > 0)

                {

                    String temp = words[j + 1];

                    words[j + 1] = words[j];

                    words[j] = temp;

                }

            }

        }

        str = "";

        for (i = 0; i < p; i++)

            str += words[i] + " ";

        P.sent = str;

    }

    public void display() {

        System.out.println("Original sentence: " + sent);

        sort(this);

        System.out.println("Sorted sentence: " + sent);

    }

    public static void main(String args[]) {

        SortAlpha ob = new SortAlpha();

        ob.acceptsent();

        ob.display();

    }

}