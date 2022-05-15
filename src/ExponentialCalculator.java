import java.util.Scanner;

public class ExponentialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter exponential: ");
        int exp = input.nextInt();

        int total = 1;

        for (int i=1; i<=exp; i++) {
            total *= number;
        }
        System.out.println(number + "^" + exp + "=" + total);
    }
}
