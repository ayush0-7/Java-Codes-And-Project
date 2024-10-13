import java.util.Scanner;

public class FindIndividualNumbersWithSameSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int inputNumber = scanner.nextInt();

        for (int i = 1; i <= inputNumber / 2; i++) {
            int sum = 0;
            for (int j = i; j <= inputNumber; j++) {
                sum += j;
                if (sum == inputNumber) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(k);
                        if (k != j) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    break;
                } else if (sum > inputNumber) {
                    break;
                }
            }
        }
    }
}
