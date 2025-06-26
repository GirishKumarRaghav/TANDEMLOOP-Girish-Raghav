import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int odd = 0;
        int a = scanner.nextInt();
        for(int i = 0; i<a; i++){
            odd = 2*i+1;
            System.out.println("You entered: " + odd);
        }

        scanner.close();
    }
}