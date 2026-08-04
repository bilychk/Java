import java.util.Scanner;
public class NumbersAverage
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble(); // Average value can be a decimal number, so double is used

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double thirdNumber = scanner.nextDouble();

        double average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("The average of three numbers is: " + average);

        scanner.close();
    }
}
