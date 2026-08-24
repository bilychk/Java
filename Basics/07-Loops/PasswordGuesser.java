import java.util.Scanner;

public class PasswordGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int password = 4321;
        boolean accessGranted = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter your password: ");
            int input = scanner.nextInt();

            if (input == password) {
                System.out.println("Access granted");
                accessGranted = true;
                break;
            } else {
                System.out.println("Password false");
            }
        }

        if (!accessGranted) {
            System.out.println("Blocked");
        }
        scanner.close();
    }
}
