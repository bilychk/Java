
// import java.util.Scanner;

// public class Loops {
    
//     public static void main(String[] args)
//     {
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
        //Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter amount of numbers n: ");
    //     int amount = sc.nextInt();

    //     int sum = 0;
    //     int positive = 0;
    //     int negative = 0;
    //     int zero = 0;
    //     int max = Integer.MIN_VALUE;
    //    // int max = ??

    //     for(int i = 1;i <= amount; i++){
    //      System.out.print("Enter the number " + i + ":");
    //      int num = sc.nextInt();
    //      sum += num;

    //      if(num > 0){
    //         positive++;
    //      }
    //      else if(num < 0){
    //         negative++;
    //      }
    //      else {
    //         zero++;
    //      }

    //         if ( num > max){
    //             max = num;
    //         }
    //     }
    //     System.out.println();
    //     System.out.println("Sum: " + sum);
    //     System.out.println("Positive numbers: " + positive);
    //     System.out.println("Negative numbers: " + negative);
    //     System.out.println("Zero numbers: " + zero);
    //     System.out.println("Max number: " + max);

    //     sc.close();

    //5 Task 1
    // for(int row = 1; row <= 4; row++){
    //     for(int column = 1; column <= 6; column++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    //6 Task 2
    // for(int i = 1; i <= 10; i++){
    //     for(int j =0; j<= 10; j++){
    //         int result = i * j;
    //         if(result % 2 == 0){
    //             System.out.println(
    //                 i + " * " + j + " = " + result);
    //         }
    //     }
    // }

    //7 Task 3
   // int target = 15;
   // for(int i = 1; i <= 20; i++){
      //  for(int j = i; j<=20; j++){
            // 1 + 14 = 15
            // 10 + 5 = 15
          //  if(i + j == target){
           //     System.out.println(i + " + " + j + " = " + target);
        //    }
     //   }
   // }

   //8 Task 4
    // for(int a = 1; a <= 30; a++){
    //     for(int b = a; b <= 30; b++){
    //         for(int c = b; c<= 30; c++){
    //             if( a * a + b * b == c * c){
    //                 System.out.println(a + "^2 +" + b + "^2 " + " = " + c + "^2 ");
    //             }
    //                 }
            //      }
            // }

    //9 Task 5
    //Task 5 — Secret Code Combinations 🔐
// Представь, что у тебя есть код сейфа из 5 цифр.
// Каждая цифра может быть от 0 до 9.
// Нужно написать программу, которая перебирает все возможные комбинации пятизначного кода и выводит только те коды, которые удовлетворяют условиям:
// Все 5 цифр разные.
// Сумма всех цифр равна 20.
// Первая цифра меньше последней.
// Вторая цифра больше четвёртой.
    // int count = 0;
    // for(int a = 0; a<= 9; a++){
    //     for(int b = 0; b<= 9; b++){
    //         for(int c = 0; c<= 9; c++){
    //             for(int d = 0; d<= 9; d++){
    //                 for(int e = 0; e<= 9; e++){
    //                     boolean allDifferent = // every number should be different
    //                     a!=b && 
    //                     a!=c &&
    //                     a!=d &&
    //                     a!=e &&
    //                     b!=c &&
    //                     b!=d &&
    //                     b!=e &&
    //                     c!=d &&
    //                     c!=e &&
    //                     d!=e;
    //                 boolean correctRes = 
    //                     a + b + c + d + e == 20;
    //                 boolean firstLessThanLast =
    //                     a < e;
    //                 boolean secondGreaterThanFourth =
    //                     b > d;
    //                 if(allDifferent && correctRes && firstLessThanLast && secondGreaterThanFourth){
    //                     System.out.println(
    //                         "" + a + b + c + d + e
    //                     );
    //                     count++;
    //                 }
    //                 }
    //                  }
    //             }
    //         }
    //     }
    //     System.out.println();
    //     System.out.println("Total combinations: " + count);

    //10 Task 6  
    // for(int a = 2; a<= 1000; a++){
    //     boolean isPrime = true;
    //     for(int b = 2; b * b <= a; b++){
    //         if(a % b == 0){ 
    //             isPrime = false;
    //             break;
    //         } 
    //     }
    //     if(isPrime){
    //         System.out.println(a);
    //     };

    // }


//      }

// }
