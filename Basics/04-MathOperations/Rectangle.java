import java.util.Scanner;
public class Rectangle
    {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter length: ");
            int length = scanner.nextInt();

            System.out.print("Enter width: ");
            int width = scanner.nextInt();

            int area = length * width;
            int perimeter = 2 * (length + width);

            System.out.println("Area = " + area);
            System.out.println("Perimeter = " + perimeter);

            scanner.close();
    }
}
