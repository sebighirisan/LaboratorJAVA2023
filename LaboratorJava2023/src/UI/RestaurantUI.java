package UI;

import Model.Restaurant;
import Repository.RestaurantRepo;

import java.util.List;
import java.util.Scanner;

public class RestaurantUI {
    private static final RestaurantRepo restaurantRepo = new RestaurantRepo();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("===================================");
            System.out.println("              Restaurant               ");
            System.out.println("===================================");
            System.out.println("1. Creaza Restaurant");
            System.out.println("2. Toate Restaurantele");
            System.out.println("3. Actualizeaza Restaurant");
            System.out.println("4. Sterge Restaurant");
            System.out.println("5. Inapoi");
            System.out.print("Alegeti comanda: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1 -> createRestaurant();
                case 2 -> viewAllRestaurante();
                case 3 -> updateRestaurant();
                case 4 -> deleteRestaurant();
                case 5 -> running = false;
                default -> System.out.println("Invalid");
            }
        }
    }

    private static void createRestaurant() {
        System.out.print("Numele Restaurantului: ");
        String Name = scanner.nextLine();

        System.out.print("Felul: ");
        String fel = scanner.nextLine();// Consume newline character

        System.out.print("Ratingul: ");
        int rating = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        Restaurant createdRestaurant = RestaurantRepo.createRestaurant(Name, fel, rating);
        System.out.println("Restaurant creat cu ID: " + createdRestaurant.getIdRestaurant());
    }

    private static void viewAllRestaurante() {
        List<Restaurant> restaurants = RestaurantRepo.getAllRestaurants();
        for (Restaurant rt : restaurants) {
            System.out.println(rt);
        }
    }

    private static void updateRestaurant() {
        System.out.print("Introduceti ID-ul Restaurantului pentru actualizare: ");
        int restaurantId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        Restaurant existingRestaurant = RestaurantRepo.getRestById(restaurantId);
        if (existingRestaurant == null) {
            System.out.println("Restaurantul nu a fost gasit.");
            return;
        }

        System.out.print("Numele Restaurantului: ");
        String Name = scanner.nextLine();

        System.out.print("Felul: ");
        String fel = scanner.nextLine();
          // Consume newline character

        System.out.print("Ratingul: ");
        int rating = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        Restaurant updatedRestaurant= new Restaurant(restaurantId, Name, fel, rating);
        RestaurantRepo.updateRestaurant(updatedRestaurant);
        System.out.println("Restaurant actualiztat cu succes");
    }

    private static void deleteRestaurant() {
        System.out.print("Introduceti ID-ul Trupei pentru stergere: ");
        int restaurantid = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        RestaurantRepo.removeRestaurant(restaurantid);
        System.out.println("Restaurant sters cu succes.");
    }
}
