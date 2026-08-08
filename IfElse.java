// If Else Statements
import java.util.Scanner;
public class IfElse {  // scanner is a class used to reading and input data transformation
    
    public static void main(String[] args){
        // Scanner scanner = new Scanner(System.in);
        // System.out.print( "Enter a number: ");
        // int number = scanner.nextInt();
        // if (number % 2 == 0){  //if statement always has () and {}!
        //     System.out.println(number+ " is even.");
        // } 
        // else if(number % 4 ==0){       // else if == elif
        //     System.out.println(number + " is divisible by 4.");
        // }
        // else {
        //     System.out.println(number + " is odd.");
        // }


        
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the first number: ");
        // int num1 = scanner.nextInt();
        // System.out.print("Enter the second number: ");
        // int num2 = scanner.nextInt();

        // if (num1 > num2) {
        //     System.out.println(num1 + "is greater than " + num2);

        // }
        // else if(num1 < num2){
        //     System.out.println(num1 + " is less than " + num2);

        // }
        // else{
        //     System.out.println(num1 + "is equal to " + num2);
        // }

        // and -) && 
        // ( if true&&true){}   it will work, cus both has to be true
        // if (true && false){}  it will NOT work

        // or -) ||
        // if(true || false){}  it will work, at least one has to be true
        // if(false || false){} it will NOT work

        //not -) !if(!false)){}

        //int age = 20; 
        // if(age == 18);
        // System.out.println("You are 18 years old.");
        // if(!(age==18))
        // System.out.println("You are not 18 years old.")

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side: ");
        int sideA = scanner.nextInt();
        System.out.println("Enter the second side:");
        int sideB = scanner.nextInt();
        System.out.println("Enter the third side: ");
        int sideC = scanner.nextInt();

        boolean isTriangle =
            sideA + sideB > sideC &&
            sideA + sideC > sideB &&
            sideB + sideC > sideA;

        if(!isTriangle){
            System.out.println("The given sides do not form a triangle.");

        }
        else if(sideA == sideB && sideB == sideC){
            System.out.println("The triangle is equilateral.");
        }
        else if(sideA == sideB || sideA == sideC || sideB == sideC){
            System.out.println("The triangle is isosceles.");
        }
        else{
            System.out.println("The triangle is scalene.");
        }


    }
}

