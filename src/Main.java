import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IphoneShop iphoneShop = IphoneShop.getInstance();
        IphoneFactory iphoneFactory = new SimpleIphoneFactory();

        // Example iPhone models
        Iphone14 iphone14 = new Iphone14();
        Iphone15 iphone15 = new Iphone15();

        // Add iPhone models to the shop
        iphoneShop.addIphoneModel(iphone14);
        iphoneShop.addIphoneModel(iphone15);

        // User interaction
        Iphone chosenIphone = null; // Store the chosen iPhone
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Choose iPhone model");
            System.out.println("2 - Add features to the chosen iPhone");
            System.out.println("3 - Buy the chosen iPhone");
            System.out.println("4 - Charge iPhone via Adapter");
            System.out.println("5 - Display available iPhone models");
            System.out.println("6 - Create a new iPhone model");
            System.out.println("7 - Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    displayAvailableModels(iphoneShop);
                    System.out.print("Enter the model number: ");
                    int modelChoice = scanner.nextInt();
                    chosenIphone = iphoneShop.getIphoneModels().get(modelChoice - 1);
                    System.out.println("Chosen iPhone: " + chosenIphone.getDescription() +
                            ", Price: $" + chosenIphone.getCost());
                }
                case 2 -> {
                    if (chosenIphone != null) {
                        chosenIphone = addFeatures(chosenIphone, scanner);
                    } else {
                        System.out.println("Please choose an iPhone model first.");
                    }
                }
                case 3 -> {
                    if (chosenIphone != null) {
                        buyIphone(chosenIphone);
                        chosenIphone = null; // Reset chosen iPhone after buying
                    } else {
                        System.out.println("Please choose an iPhone model first.");
                    }
                }
                case 4 -> {
                    if (chosenIphone != null) {
                        chargeViaAdapter(chosenIphone);
                    } else {
                        System.out.println("Please choose an iPhone model first.");
                    }
                }
                case 5 -> displayAvailableModels(iphoneShop);
                case 6 -> createNewIphone(iphoneShop, iphoneFactory, scanner);
                case 7 -> System.out.println("Exiting the program.");
                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void displayAvailableModels(IphoneShop iphoneShop) {
        System.out.println("\nAvailable iPhone Models:");
        List<Iphone> iphoneModels = iphoneShop.getIphoneModels();
        for (int i = 0; i < iphoneModels.size(); i++) {
            Iphone iphone = iphoneModels.get(i);
            System.out.println((i + 1) + " - " + iphone.getDescription() +
                    ", Price: $" + iphone.getCost());
        }
    }

    private static Iphone addFeatures(Iphone iphone, Scanner scanner) {
        int featureChoice;
        do {
            System.out.println("\nAdd Features:");
            System.out.println("1 - Wireless Charging");
            System.out.println("2 - Face ID");
            System.out.println("3 - Done adding features");
            System.out.print("Enter your choice: ");

            featureChoice = scanner.nextInt();

            switch (featureChoice) {
                case 1 -> {
                    iphone = new WirelessCharging(iphone);
                    System.out.println("Added Wireless Charging to the iPhone.");
                }
                case 2 -> {
                    iphone = new FaceID(iphone);
                    System.out.println("Added Face ID to the iPhone.");
                }
                case 3 -> System.out.println("Features added. Updated iPhone: " +
                        iphone.getDescription() + ", Price: $" + iphone.getCost());
                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (featureChoice != 3);
        return iphone;
    }

    private static void buyIphone(Iphone iphone) {
        System.out.println("Buying the iPhone:");
        System.out.println("Final iPhone Details: " + iphone.getDescription() +
                ", Final Price: $" + iphone.getCost());
    }

    private static void chargeViaAdapter(Iphone iphone) {
        System.out.println("Charging iPhone via Adapter:");
        ChargingStrategy chargingStrategy = new USBTypeCChargingStrategy();
        USBTypeCAdapter usbTypeCAdapter = new USBTypeCAdapter(chargingStrategy);
        usbTypeCAdapter.chargeWithLightning();
    }

    private static void createNewIphone(IphoneShop iphoneShop, IphoneFactory iphoneFactory, Scanner scanner) {
        System.out.print("Enter the model name for the new iPhone: ");
        String modelName = scanner.next();

        System.out.print("Enter the base cost for the new iPhone: $");
        double baseCost = scanner.nextDouble();

        // Create a new iPhone using the factory
        Iphone newIphone = iphoneFactory.createIphone(modelName, baseCost);

        // Add the new iPhone to the shop
        iphoneShop.addIphoneModel(newIphone);

        System.out.println("New iPhone created and added to the shop.");
    }
}