import java.util.Scanner;
public class Delivery_price {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the order price: ");
        double orderSum = scanner.nextDouble();

        System.out.print("Is it urgent delivery or not? (1/0): ");
        String answer = scanner.next();
        boolean isUrgent = answer.equals("1");

        double cost;

        if (orderSum < 50) {  // If its below 50 then cost is 8
            cost = 8;
        }
        else if (orderSum < 100) {  
            cost = 4;
        }
        else {  // 100 and up is 0 cost.
            cost = 0;
        }

        if (isUrgent) {  // If its urgent delivery then plus 6 eur
            cost += 6;
        }

        double totalPrice = orderSum + cost;

        System.out.println("The price for delivery is: " + cost);
        System.out.println("Total cost of delivery: " + totalPrice);

        scanner.close();
    }
   
}
