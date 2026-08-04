import java.util.Scanner;
public class TimeConverter
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        int total = hours * 60 + minutes;

        System.out.println("Total minutes: " + total);

        scanner.close();
    }
}
