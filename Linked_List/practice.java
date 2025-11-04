import java.util.*;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n= in.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            list.add(i);
        }
        for (int j = 1; j < list.size(); j++) {
            System.out.print(list.get(j)+"->");
        }
    }
}
