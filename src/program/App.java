package program;

import java.util.Locale;
import java.util.Scanner;

import model.services.InterestService;
import model.services.UsaInterstService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Months: ");
        int months = scanner.nextInt();
        InterestService brazilInterestService = new UsaInterstService(1.0);
        double payment = brazilInterestService.payment(amount, months);
        System.out.printf("payment after %d months %n",months);
        System.out.printf("%.2f",payment);


        scanner.close();
    }
}
