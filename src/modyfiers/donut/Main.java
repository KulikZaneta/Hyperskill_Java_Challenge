package modyfiers.donut;

import modyfiers.donut.DonutStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String flavor = input.nextLine();

        double sellDonut = new DonutStore().sellDonut(flavor);
        System.out.println(sellDonut);

    }
}

