import java.util.Scanner;

public class even_numbers {    //we only sum even numbers for ex. we put 3 as entry 1-no 2-yes 3- no. so the answer is 0+2+0 = 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {   
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers: " + sum);

        sc.close();
    }
}
