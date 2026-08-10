import java.util.Scanner;
public class Deposit_cost {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount for deposit: ");
        double deposit = scanner.nextDouble();

        System.out.print("Enter amount of months: ");
        int months = scanner.nextInt();

        double rate;

        if (deposit < 1000) {  // 4% per year
            rate = 4;
        }
        else if (deposit < 5000) {  // from 1000 to 4999
            rate = 6;
        }
        else if (deposit < 10000) {  
            rate = 8;
        }
        else {  //above 10000
            rate = 10;
        }

        if (months >= 12) {  // if months above 12, then extra rate adds.
            rate += 1;
        }

        double profit = deposit * rate / 100 * months / 12;
        double totalSum = deposit + profit;

        System.out.println("Final Rate: " + rate + "%");
        System.out.println("Profit: " + profit);
        System.out.println("Total cost: " + totalSum);

        scanner.close();
    }
   
}