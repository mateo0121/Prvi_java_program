
import java.util.Scanner;

public class temp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int count = 0;
        double min = 0.0;
        double max = 0.0;
        double total = 0.0;
        int povisenaTemp = 0;
        final double GRANICA = 37.0;

        System.out.println("Unosi izmjerene temperature, 0 za kraj.");

        while (true) {
            System.out.print("Temperatura: ");
            
 
            if (!input.hasNextDouble()) {
                input.next(); 
                continue;
            }

            double temp = input.nextDouble();

         
            if (temp == 0) {
                break;
            }

     
            if (count == 0 || temp < min) {
                min = temp;
            }
            if (count == 0 || temp > max) {
                max = temp;
            }

    
            if (temp > GRANICA) {
                povisenaTemp++;
            }

            total += temp;
            count++;
        }

        System.out.println(); 

        if (count == 0) {
            System.out.println("Nije uneseno nijedno mjerenje.");
        } else {
            double average = total / count;

            System.out.printf("Broj mjerenja: %d%n", count);
            System.out.printf("Najniža: %.2f%n", min);
            System.out.printf("Najviša: %.2f%n", max);
            System.out.printf("Prosjek: %.2f%n", average);
            System.out.printf("Povišenih mjerenja: %d%n", povisenaTemp);


            if (povisenaTemp > 0) {
                System.out.println("Povišena temperatura zabilježena.");
            } else {
                System.out.println("Sva mjerenja u granicama normale.");
            }
        }

  
        input.close();
    }
}