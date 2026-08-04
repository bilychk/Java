import java.util.Scanner;
// Instead of print function like in python, java need System.out.printDatatype
//2
public class TwoNumbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("The sum of two numbers is: "+ (num1 + num2)+ ".");
        scanner.close();

    }
}
