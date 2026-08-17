import java.util.Scanner;

public class range_with_step {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.print("Enter step: ");
        int step = sc.nextInt();

        if (start > end) {
            System.out.println("Error: start must be less than or equal to end.");
        } else {
            for (int i = start; i <= end; i += step) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
