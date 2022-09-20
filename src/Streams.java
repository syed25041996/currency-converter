import java.util.Scanner;

/**
 * Simple program to convert INR to USD
 *
 * @author Syed
 * @since 20/09/2022
 */
public class Streams {

    public static void main(String[] args){

        // 1 inr = 0.013 usd
        // 5 inr = 5 * 0.013 usd
        // 'n' inr = 'n' * 0.013 usd

        Scanner sc = new Scanner(System.in);

        double rupees = sc.nextDouble();

        System.out.println("Enter currency in rupees " + rupees);

        double dollars = rupees * 0.013;

        System.out.println("The converted value in USD " + dollars);

        sc.close();
    }
}
