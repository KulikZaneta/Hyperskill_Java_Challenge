package _break.heigth_of_bus;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int countBridge = scanner.nextInt();
        boolean crash = false;

        for(int i = 1; i <= countBridge; i++) {
            int nMost = scanner.nextInt();
            if(nMost <= height) {
                System.out.println("Will crash on bridge " + i);
                crash = true;
                break;
            }
        }
        if(!crash) {
            System.out.println("Will not crash");
        }
    }
}

