package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicStore store = new MusicStore();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Music Store!");
            store.showInstrumentCategories();
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    store.showGuitarTypes();
                    System.out.print("Choose a type of guitar: ");
                    int guitarChoice = scanner.nextInt();
                    scanner.nextLine();

                    String guitarType = "";
                    switch (guitarChoice) {
                        case 1:
                            guitarType = "bass";
                            break;
                        case 2:
                            guitarType = "acoustic";
                            break;
                        case 3:
                            guitarType = "classical";
                            break;
                        case 4:
                            guitarType = "electric";
                            break;
                        default:
                            System.out.println("Invalid guitar type.");
                            continue;
                    }

                    store.showGuitarModels(guitarType);

                    System.out.print("Choose a model number to see the description (or 0 to go back): ");
                    int modelChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (modelChoice > 0) {
                        store.showModelDescription("guitar", guitarType, modelChoice - 1);
                    } else {
                        System.out.println("Returning to main menu...");
                    }
                    break;

                case 2:
                    store.showKeyboardTypes();
                    System.out.print("Choose a type of keyboard instrument: ");
                    int keyboardChoice = scanner.nextInt();
                    scanner.nextLine();

                    String keyboardType = "";
                    switch (keyboardChoice) {
                        case 1:
                            keyboardType = "piano";
                            break;
                        case 2:
                            keyboardType = "organ";
                            break;
                        case 3:
                            keyboardType = "synthesizer";
                            break;
                        case 4:
                            keyboardType = "accordion";
                            break;
                        default:
                            System.out.println("Invalid keyboard type.");
                            continue;
                    }

                    store.showKeyboardModels(keyboardType);

                    System.out.print("Choose a model number to see the description (or 0 to go back): ");
                    int modelKeyboardChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (modelKeyboardChoice > 0) {
                        store.showModelDescription("keyboard", keyboardType, modelKeyboardChoice - 1);
                    } else {
                        System.out.println("Returning to main menu...");
                    }
                    break;

                case 3:
                    store.showDrumTypes();
                    System.out.print("Choose a type of drum: ");
                    int drumChoice = scanner.nextInt();
                    scanner.nextLine();

                    String drumType = "";
                    switch (drumChoice) {
                        case 1:
                            drumType = "drum set";
                            break;
                        case 2:
                            drumType = "snare drum";
                            break;
                        case 3:
                            drumType = "cajon";
                            break;
                        default:
                            System.out.println("Invalid drum type.");
                            continue;
                    }

                    store.showDrumModels(drumType);

                    System.out.print("Choose a model number to see the description (or 0 to go back): ");
                    int modelDrumChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (modelDrumChoice > 0) {
                        store.showModelDescription("drum", drumType, modelDrumChoice - 1);
                    } else {
                        System.out.println("Returning to main menu...");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the store. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
