import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of grades: ");
        int n = scanner.nextInt();

        int sum = 0;
        int fives = 0;
        int unsatisfactory = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade " + i + ": ");
            int grade = scanner.nextInt();

            sum += grade;

            if (grade == 5) {
                fives++;
            }

            if (grade == 1 || grade == 2) {
                unsatisfactory++;
            }
        }

        double average = (double) sum / n;

        System.out.println("Mean: " + average);
        System.out.println("Amount of grades with excellent value: " + fives);
        System.out.println("Amount of grades with bad value: " + unsatisfactory);
        scanner.close();
    }
}
