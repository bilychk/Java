import java.util.Scanner;
public class DateChecker {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = scanner.nextInt(); 

        System.out.print("Enter month: ");
        int month = scanner.nextInt(); 

        // boolean - true or false
        boolean isValid;
        if (month < 1 || month > 12) {  // || is or statement
            isValid = false;
        }
        else if (month == 2) {  //february check
            isValid = day >= 1 && day <= 28;  // && two statements must be true!
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) { // if is april, june, sept or november then there is 30 days.
            isValid = day >= 1 && day <= 30;
        }
        else {
            isValid = day >= 1 && day <= 31;
        }

    
        if (isValid) { //Final output
            System.out.println("Yes, the date is correct.");
        } else {
            System.out.println("No, this date doesn't exist.");
        }
        scanner.close();
    }
   
}

