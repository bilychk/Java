public class Orbital{
    public static void main(String[] args) {
        int total = 0;
        int day = 1; // cant be zero 

        //while for days
        while(total < 500){
            int energy = 0; //day energy
            System.out.println("Day: " + day);

            for(int modul =1; modul <= 5; modul++){  

                int energy_used =0; // energy of module
                int amount = 200 + day;  // energy used for a day
                int impulses = 0;
                
                while( energy_used < amount){
                    energy_used += modul + 200;
                    impulses++;

                }
                System.out.println("Number of modul: " + modul + " Impulses: " + impulses + " Amount of energy used: " +energy_used);
                energy += energy_used;
                total += energy;
        System.out.println("Amount of energy total: " + total ); // add step
        day++;


        }
        
    }
}
}