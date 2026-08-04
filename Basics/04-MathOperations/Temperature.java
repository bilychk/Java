import java.util.Scanner;
class Temperature {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in celsius to convert it later to Fahrenheit: ");
        double temp = scanner.nextDouble();   //I used double because if user enters 36.6 in int it will print out an error.
        double fahrenheit = temp * 9 / 5 + 32;
        System.out.println("Here is your temperature in Foreingeith: " + fahrenheit);
        scanner.close();

    }
}
