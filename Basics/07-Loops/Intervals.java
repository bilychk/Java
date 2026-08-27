public class Intervals {
    public static void main(String[] args) {
        int day = 1;
        int succesful = 0;

        while(day <= 10 && succesful < 2){
            int window_with_success = 0;
            System.out.print("Day: " + day);

            for(int window = 1; window<= 8; window++ ){
                int signal = 0;
                int step = 0;
                int max = 10;
                while( signal < max && step < 4){
                    signal += 3;
                    step++;
                }
                if(signal>= max){
                    window_with_success++;
                }
                System.out.println("The window: " + window + "Amount of steps: " + step);
            }
            if(window_with_success >= 6){
                succesful++;
                System.out.println("The night was succesful!!!");
            }
            else{
                System.out.println("The night is not succesful.");
            }
            System.out.println("Amount of succesful windows: "+ window_with_success);
            day++;
        }
    }
    
}
