import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of elements
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        // Taking input
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i]; // adding to sum
        }

        // Calculate average
        double average = (double) sum / n;

        // Output result
        System.out.println("Average = " + average);
    }
}
 

