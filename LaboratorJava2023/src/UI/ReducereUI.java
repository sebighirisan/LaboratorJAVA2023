package UI;

import Model.Reducere;
import Repository.ReducereRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ReducereUI {
    private static final ReducereRepo reducereRepoRepo = new ReducereRepo();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("===================================");
            System.out.println("           Reducere            ");
            System.out.println("===================================");
            System.out.println("1. Creaza Reducere");
            System.out.println("2. Toate reducerile");
            System.out.println("3. Actualizare Reducere");
            System.out.println("4. Sterge Reducere");
            System.out.println("5. Inapoi");
            System.out.print("Alegeti comanda: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1 -> createReducere();
                case 2 -> viewAllReduceri();
                case 3 -> updateReducere();
                case 4 -> deleteReducere();
                case 5 -> running = false;
                default -> System.out.println("Invalid");
            }
        }
    }

    private static void createReducere() {



        System.out.print("Cupon: ");
        String cupon = scanner.nextLine();

        System.out.print("Valabilitate: ");
        int valabilitate = Integer.parseInt(scanner.nextLine());

        System.out.print("IdRestaurant ");
        int idrest = Integer.parseInt(scanner.nextLine());



        Reducere createdReducere = ReducereRepo.createReducere(cupon, valabilitate, idrest);
        System.out.println("Reducere creata cu ID: " + createdReducere.getIdReducere());
    }

    private static void viewAllReduceri() {
        List<Reducere> reduceri = ReducereRepo.getAllReduceri();
        for (Reducere r : reduceri) {
            System.out.println(r);
        }
    }

    private static void updateReducere() {
        System.out.print("Introduceti ID-ul reducerii pentru actualizare: ");
        int idreducere = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        Reducere existingReducere = reducereRepoRepo.getReducereById(idreducere);
        if (existingReducere == null) {
            System.out.println("Reducerea nu a fost gasita.");
            return;
        }


        System.out.print("Cupon: ");
        String cupon = scanner.nextLine();

        System.out.print("Valabilitate: ");
        int valabilitate = Integer.parseInt(scanner.nextLine());


        Reducere updatedReducere = new Reducere(idreducere, cupon, valabilitate, existingReducere.getIdRestaurant());
        reducereRepoRepo.updateReducere(updatedReducere);
        System.out.println("Reducere actualizata cu succes.");
    }

    private static void deleteReducere() {
        System.out.print("Introduceti ID-ul Reducerii pentru a fi sters: ");
        int reducereId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        reducereRepoRepo.removeReducere(reducereId);
        System.out.println("Membru Trupa sters cu succes.");
    }
}
