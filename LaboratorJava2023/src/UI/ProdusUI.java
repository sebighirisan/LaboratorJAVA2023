package UI;

import Model.Produs;
import Repository.ProdusRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ProdusUI {
    private static final ProdusRepo produsRepo = new ProdusRepo();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("===================================");
            System.out.println("           Produs            ");
            System.out.println("===================================");
            System.out.println("1. Creaza Produs");
            System.out.println("2. Toate produsele");
            System.out.println("3. Actualizare Produs");
            System.out.println("4. Sterge Produs");
            System.out.println("5. Inapoi");
            System.out.print("Alegeti comanda: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    createProdus();
                    break;
                case 2:
                    viewAllProduse();
                    break;
                case 3:
                    updateProdus();
                    break;
                case 4:
                    deleteProdus();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }

    private static void createProdus() {
        System.out.print("Denumire: ");
        String denumire = scanner.nextLine();

        System.out.print("Pret: ");
        int pret = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrediente: ");
        String ingrediente = scanner.nextLine();


        System.out.print("ID-ul Produsului: ");
        int produsId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        Produs createdProdus= ProdusRepo.createProdus(denumire,pret,ingrediente);
        System.out.println("Membru Trupa creat cu ID: " + createdProdus.getIdProdus());
    }

    private static void viewAllProduse() {
        List<Produs> produse = ProdusRepo.getAllProduse();
        for (Produs p : produse) {
            System.out.println(p);
        }
    }

    private static void updateProdus() {
        System.out.print("Introduceti ID-ul Produsului pentru actualizare: ");
        int produsId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        Produs existingProdus = ProdusRepo.getProdusById(produsId);
        if (existingProdus == null) {
            System.out.println("Produsul nu a fost gasit.");
            return;
        }

        System.out.print("Nume nou: ");
        String denumire = scanner.nextLine();

        System.out.print("Pret nou: ");
        int pret = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrediente: ");
        String ingrediente = scanner.nextLine();


        Produs updatedProdus = new Produs(produsId, denumire, pret, ingrediente);
        produsRepo.updateProdus(updatedProdus);
        System.out.println("Produs actualizat cu succes.");
    }

    private static void deleteProdus() {
        System.out.print("Introduceti ID-ul Produsului pentru a fi sters: ");
        int produsid = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        produsRepo.removeProdus(produsid);
        System.out.println("Produs sters cu succes.");
    }
}
