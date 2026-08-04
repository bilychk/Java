import java.util.Scanner;
public class Student
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        System.out.print("Enter your favorite subject: ");
        String favoriteSubject = scanner.nextLine();

        System.out.print("How many hours do you study per week? ");
        int studyhoursweek = scanner.nextInt();

        int studyhoursmonth = studyhoursweek * 4;

        System.out.println();
        System.out.println("----- Student Profile -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Favorite subject: " + favoriteSubject);
        System.out.println("Study hours per week: " + studyhoursweek);
        System.out.println("Study hours in 4 weeks: " + studyhoursmonth);

        scanner.close();
    }
}
