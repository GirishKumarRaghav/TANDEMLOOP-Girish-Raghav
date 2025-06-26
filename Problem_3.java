import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = scanner.nextInt();
        int max = (input % 2 == 0) ? input-1 : input;

        for (int i = 0; i < max; i++) {
            int oddNumber = 2 * i + 1;
            System.out.println("You entered: " + oddNumber);
        }

        scanner.close();
    }
}
