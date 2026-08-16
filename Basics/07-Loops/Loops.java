
import java.util.Scanner;

public class Loops {
    
    public static void main(String[] args)
    {
        // while
        // do while
        // for
        // for each

        // int i = 1;
        // while(i <= 5){
        //     System.out.print(i);
        //     i += 1;
        //     i++; // i +=1 Works only for one!

        // for i in lst -) []
        // for i in range(start,end,step)
        // int sum = 0;
        // for(int i = 1; i <= 10; i++){  // i exist only inside this for loop.
        //     sum += i;
        //     System.out.println("i = " + i + ", sum = " + sum);


// 1
            // Scanner sc = new Scanner(System.in);
            // int start = sc.nextInt();
            // int end = sc.nextInt();
            // int step = sc.nextInt();
            // System.out.println();
            // if(step <= 0 || start > end){
            //     System.out.println("Incorrect data");

            // }
            // else{
            //     for(int i = start; i <= end; i += step){
            //         System.out.println(i + " ");
            //     }
            // }



            // // 2
            // Scanner sc = new Scanner(System.in);
            // System.out.print( "Enter a number: ");
            // int num = sc.nextInt();
            // boolean isPrime = num >= 2;
            // for(int i = 2; i * i<= num && isPrime; i++){
            //     if(num % i == 0){
            //         isPrime = false;
            //     }
            // }
            // if(isPrime){
            //     System.out.println("Prime number");

            // }
            // else{
            //     System.out.println("Isn't prime number");
            // }

            // 3

        //     Scanner sc = new Scanner(System.in);
        //     int choice = 0;
        //     do{
        //         System.out.println("1. Say Hello");
        //         System.out.println("2. Square");
        //         choice = sc.nextInt();

        //         if(choice ==1){
        //             System.out.println("Hello!");  // println is for going to next line
        //         }
        //         else if(choice == 2){
        //             System.out.print("Enter a number: ");
        //             int n = sc.nextInt();
        //             System.out.println("Square " +n * n);
        //         }
        //         else if(choice == 0){
        //             System.out.println("Error");

        //         }
        //     }while(choice != 0); // Even if its false, he will work atleast one time.
        // }

        // 4
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of numbers n: ");
        int amount = sc.nextInt();

        int sum = 0;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int max = Integer.MIN_VALUE;
       // int max = ??

        for(int i = 1;i <= amount; i++){
         System.out.print("Enter the number " + i + ":");
         int num = sc.nextInt();
         sum += num;

         if(num > 0){
            positive++;
         }
         else if(num < 0){
            negative++;
         }
         else {
            zero++;
         }

            if ( num > max){
                max = num;
            }
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zero numbers: " + zero);
        System.out.println("Max number: " + max);

        sc.close();
        }

    }
