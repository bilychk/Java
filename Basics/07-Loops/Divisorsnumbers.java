public class Divisorsnumbers {
    public static void main(String[] args){

        int number = 100;
        int maxsum = 0;
        int maxnum = 0;

        while (number <= 180){
            int sum = 0;
            int count = 0;
            int divide = 1;


            while(divide <= number){ //poka delitel menshe 4isla naprimer 100 
                if (number % divide == 0){ //delitsja bes ostatka
                    sum+= divide;
                    count++;
                    
                }
                divide++;

            }
            if (count == 8 && sum % 5 == 0){ //esli 8 raz delitsja i delitsja summa na 5 to
                System.out.println("Amount of divisors: " + count + " Sum: " + sum);

                if(sum > maxsum){
                    maxsum = sum;
                    maxnum = number; // tak kak mi vse esho v cicle while
                }
                }
                number++;

        }
        System.out.println("The number with max sum of divisors: " + maxnum);
        System.out.println("Amount of divisors: " + maxsum);
    }
}
