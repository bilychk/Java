import java.util.Scanner;
public class Main //We can do only one public class in one file
{
    public static void main(String[] args){
        System.out.println("Hello world");   // ln is line new    , to comment whole section pick Command and ?/ button
        System.out.println("Hello");
        // print() - everything in one line
        // println() - every line in differetn row
        // \n - new line
        // \t - tabulation
        // \\ - print("Hello\\world") then it will appear like Hello\world

        //data_type val_name = value
        // int - number w.o a comma (4 bytes)
        // int price = 5.5 is not allowed
        //int price = 5;
        // Every data type in java is a class


        //short - number w.o comma (2 bytes) -32768 to 32767
        // shor a =4;


        //float - number with a comma (4 bytes)
        
        //float x =5.5f its a must to write extra "f", so the number is a float!!!!

        // double - number with a comma (8 bytes)
        // double x = 5.5;

        //boolean - true or false, but you cant write 1 or 0 (1 bytes)
        //boolean isSomething = true;

        //byte -127 do 126 (1 bayt)
        //byte a = 12;

        // char 
        // char x = 97; //a
        // System.out.print(x);


    }
}

// Переменная - это именованное место для хранения значения. У каждой переменной в Java есть тип, имя и текущее значение.





// 1
class VisitCard
{
    public static void main(String[] args) {
        String name = "Kristina";
        int age = 21;
        String city = "Tallinn";
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
    }
}



class TwoNumbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("The sum of two numbers is: "+ (num1 + num2)+ ".");
        scanner.close();

    }
}