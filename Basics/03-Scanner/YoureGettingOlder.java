import java.util.Scanner;
public class YoureGettingOlder
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hey, " + (name)+ "!" + ". Your age next year gonna be "+ (age + 1)+ ". Yay!");
        scanner.close();
    }
}
