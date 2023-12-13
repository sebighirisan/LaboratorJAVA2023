package UI;

import Model.Livrator;
import Repository.LivratorRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class LivratorUI {
    private static final LivratorRepo livratorRepo = new LivratorRepo();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("===================================");
            System.out.println("             Livrator               ");
            System.out.println("===================================");
            System.out.println("1. Creare Livrator");
            System.out.println("2. Toti Livratorii");
            System.out.println("3. Actualizare Livrator");
            System.out.println("4. Sterge Livrator");
            System.out.println("5. Inapoi");
            System.out.print("Alegeti comanda: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1 -> createLivrator();
                case 2 -> viewAllLivratori();
                case 3 -> updateLivrator();
                case 4 -> deleteLivrator();
                case 5 -> running = false;
                default -> System.out.println("Invalid");
            }
        }
    }

    private static void createLivrator() {
        System.out.print("Nume: ");
        String firstName = scanner.nextLine();

        System.out.print("Prenume: ");
        String lastName = scanner.nextLine();

        System.out.print("Data nasterii (yyyy-MM-dd): ");
        String dateOfBirthStr = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);

        System.out.print("Vehicul: ");
        String vehicul = scanner.nextLine();

        Livrator createdLivrator = livratorRepo.createLivrator(firstName, lastName, dateOfBirth,vehicul);
        System.out.println("Livrator creat cu ID: " + createdLivrator.getIdLivrator());
    }

    private static void viewAllLivratori() {
        List<Livrator> livratori = livratorRepo.getAllLivratori();
        for (Livrator livrator : livratori) {
            System.out.println(livrator);
        }
    }

    private static void updateLivrator() {
        System.out.print("Introduceti ID-ul Livratorului pentru actualizare: ");
        int livratorID = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        Livrator existingLivrator = livratorRepo.getLivratorById(livratorID);
        if (existingLivrator == null) {
            System.out.println("LIvratorul nu a fost agsit.");
            return;
        }

        System.out.print("Numele nou: ");
        String firstName = scanner.nextLine();

        System.out.print("Prenumele nou: ");
        String lastName = scanner.nextLine();

        System.out.print("Noua Data de nastere (yyyy-MM-dd): ");
        String dateOfBirthStr = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);

        System.out.print("Vehicul nou: ");
        String vehicul = scanner.nextLine();

        Livrator updatedLivrator = new Livrator(livratorID, firstName, lastName, dateOfBirth,vehicul);
        livratorRepo.updateLivrator(updatedLivrator);
        System.out.println("Livratorul a fost actualizat cu succes.");
    }

    private static void deleteLivrator() {
        System.out.print("Introduceti ID-ul Livartor pentru a fi sters: ");
        int livratorid = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        livratorRepo.removeLivrator(livratorid);
        System.out.println("Livratorul a fost sters cu succes.");
    }
}
