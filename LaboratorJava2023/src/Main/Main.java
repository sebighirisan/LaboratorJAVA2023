package Main;

import UI.LivratorUI;
import UI.ProdusUI;
import UI.ReducereUI;
import UI.RestaurantUI;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("===================================");
            System.out.println("               FoodDelivery              ");
            System.out.println("===================================");
            System.out.println("1. Livrator ");
            System.out.println("2. Produs ");
            System.out.println("3. Restaurant ");
            System.out.println("4. Reducere ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1 -> LivratorUI.main(new String[]{});
                case 2 -> ProdusUI.main(new String[]{});
                case 3 -> RestaurantUI.main(new String[]{});
                case 4 -> ReducereUI.main(new String[]{});
                case 11 -> running = false;
                default -> System.out.println("Invalid");
            }
        }
    }
}