import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TransportRepo repo = new TransportRepo();

        boolean run = true;
        menu();
        while (run) {
            switch (scan.nextLine()) {
                case "0":
                    run = false;
                    break;
                case "1":
                    System.out.println("Please select one of the following options:");
                    System.out.println("a Land transport");
                    System.out.println("b Rail transport");
                    System.out.println("c Air transport");
                    System.out.println("d Sea/waterway transport");
                    String selector = scan.nextLine();
                    switch (selector) {
                        case "a":
                            repo.increaseLT();
                            break;
                        case "b":
                            repo.increaseRT();
                            break;
                        case "c":
                            repo.increaseAT();
                            break;
                        case "d":
                            repo.increaseST();
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Please, enter the TMR Number:");
                    String faxToRemove = scan.nextLine();
                    repo.removeByFaxNumber(faxToRemove);
                    break;
                case "3":
                    //Change existing transport
                    System.out.println("Please, enter Fax Number:");
                    String numberOfFax = scan.nextLine();
                    repo.changeExistingTransport(numberOfFax);
                    System.out.println("Please select one of the following options:");
                    System.out.println("a Land transport");
                    System.out.println("b Rail transport");
                    System.out.println("c Air transport");
                    System.out.println("d Sea/waterway transport");
                    String transportToAdd = scan.nextLine();
                    switch (transportToAdd) {
                        case "a":
                            repo.increaseLT();
                            break;
                        case "b":
                            repo.increaseRT();
                            break;
                        case "c":
                            repo.increaseAT();
                            break;
                        case "d":
                            repo.increaseST();
                            break;
                    }
                    break;
                case "4":
                    System.out.println("Please, enter the TMR Number:");
                    String number = scan.nextLine();
                    repo.searchByTMR(number);
                    break;
                case "5":
                    System.out.println("Please, enter the Fax Number:");
                    String faxNumber = scan.nextLine();
                    repo.searchByFaxNumber(repo.landTransports, faxNumber);
                    break;
                case "6":
                    break;
                case "7":
                    writeToFileLand(repo.landTransports);
//                    writeToFileRail(repo.railTransports);
//                    writeToFileAir(repo.airTransports);
//                    writeToFileSea(repo.seaTransports);
                    break;
                case "8":
                    readFile(repo);
                    break;
                case "9":
                    System.out.println(repo.landTransports);
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Welcome to the NLCC Transport Data Base");
        System.out.println("0. Close"); //done
        System.out.println("1. Choose the transport you want to add"); //done for land
        System.out.println("a Land transport");  //done
        System.out.println("b Rail transport"); //TODO
        System.out.println("c Air transport"); //TODO
        System.out.println("d Sea/waterway transport"); //TODO
        System.out.println("2. Remove transport from data"); //Done for TMR
        System.out.println("3. Change existing transport");
        System.out.println("4. Search by TMR"); //Done
        System.out.println("5. Search by FAX number"); //Done
        System.out.println("6. Search in a time period for transports"); //TODO
        System.out.println("7. Save changes"); //Done for land
        System.out.println("8. Read from files"); //Done for land
        System.out.println("9. Print all transports"); //Done for land

    }


    // have to create an operator witch can get an object and then iterate itself
    public static void writeToFileLand(ArrayList<LandTransport> transports) {
        FileUtilities.createFile("Land Transports.txt");
        FileUtilities.writeToFile(transports, "Land Transports.txt");
    }

//    public static void writeToFileRail(ArrayList<RailTransport> transports) {
//        FileUtilities.createFile("Railway Transports.txt");
//        for (Transport transport : transports) {
//            FileUtilities.writeToFile(transport, "Railway Transports.txt");
//        }
//    }
//
//    public static void writeToFileAir(ArrayList<AirTransport> transports) {
//        FileUtilities.createFile("Air Transports.txt");
//        for (Transport transport : transports) {
//            FileUtilities.writeToFile(transport, "Air Transports.txt");
//        }
//    }
//
//    public static void writeToFileSea(ArrayList<SeaAndWaterWayTransport> transports) {
//        for (SeaAndWaterWayTransport transport : transports) {
//            FileUtilities.createFile("Sea Transports.txt");
//            FileUtilities.writeToFile(transport, "Sea Transports.txt");
//        }
//    }
//    --------------------------------------------------------------------------

    //create a method that can read from every .txt file or a recursive method that calls other reading files
    public static void readFile(TransportRepo repo) {
        repo.landTransports = FileUtilities.readFromFile("Land Transports.txt");

//        Transport transportsAir = FileUtilities.readFromFile("Air Transports.txt");
//        Transport transportsRail = FileUtilities.readFromFile("Railway Transports.txt");
//        Transport transportsSea = FileUtilities.readFromFile("Sea Transports.txt");
    }
}