import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static int sumOfDivisors(int start, int end, int a, int b) {
        return IntStream.rangeClosed(start, end).filter(i -> (i % a == 0) || (i % b == 0)).distinct().sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending range: ");
        int end = scanner.nextInt();
        System.out.print("Enter the first divisor: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second divisor: ");
        int b = scanner.nextInt();

        System.out.println("Result: " + sumOfDivisors(start, end, a, b));

        scanner.close();
    }
}