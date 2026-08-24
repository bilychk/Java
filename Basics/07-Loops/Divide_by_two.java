import java.util.Scanner;

public class Divide_by_two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter positive number: ");
        int number = scanner.nextInt();

        int count = 0;

        while (number % 2 == 0) {
            number /= 2;
            count++;
        }

        System.out.println("End number: " + number);
        System.out.println("Amount of divides: " + count);
        scanner.close();
    }
    
}
