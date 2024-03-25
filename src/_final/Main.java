package _final;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    private static final double TAX_RATE = 0.1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basePrice = scanner.nextDouble();
        double tax =  basePrice * TAX_RATE;
        double finalPrice = basePrice + tax;

        DecimalFormat df = new DecimalFormat("0.00");
        String formattedFinalPrice = df.format(finalPrice);

        System.out.println(formattedFinalPrice);

        scanner.close();
    }
}