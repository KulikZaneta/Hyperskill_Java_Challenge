package iterating_over_arrays.individual_taxes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCompany = scanner.nextInt();
        int[] company = new int[countCompany];
        int[] taxes = new int[countCompany];

        for (int i = 0; i < company.length; i++) {
            company[i] = scanner.nextInt();
        }

        for (int i = 0; i < countCompany; i++) {
            taxes[i] = scanner.nextInt();
        }

        int maxTaxCompany = calculateMaxTaxCompany(countCompany, company, taxes);
        System.out.println(maxTaxCompany);
    }

    public static int calculateMaxTaxCompany(int countCompany, int[] company, int[] taxes) {
        double maxTax = 0;
        int maxTaxCompany = company[0];

        for (
                int i = 0;
                i < countCompany; i++) {
            double tax = company[i] * taxes[i] / 100.0;

            if (tax > maxTax) {
                maxTax = tax;
                maxTaxCompany = i + 1;
            }
        }
        return maxTaxCompany;
    }
}



