import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TransportRepo repo = new TransportRepo();

//        ArrayList<LandTransport> landTransports = new ArrayList<>();
//        ArrayList<RailTransport> railTransports = new ArrayList<>();
//        ArrayList<AirTransport> airTransports = new ArrayList<>();
//        ArrayList<SeaAndWaterWayTransport> seaTransports = new ArrayList<>();
        boolean run = true;
        while (run) {
            menu();
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
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    writeToFileLand(repo.landTransports);
                    writeToFileRail(repo.railTransports);
                    writeToFileAir(repo.airTransports);
                    writeToFileSea(repo.seaTransports);
                    break;
                case "8":
                    readFile(repo);
                    break;
                case "9":
                    repo.landTransports.toString();
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("Welcome to the NLCC Transport Data Base");
        System.out.println("0. Close");
        System.out.println("1. Choose the transport you want to add");
        System.out.println("a Land transport");
        System.out.println("b Rail transport");
        System.out.println("c Air transport");
        System.out.println("d Sea/waterway transport");
        System.out.println("2. Remove transport from data");
        System.out.println("3. Change existing transport");
        System.out.println("4. Search by TMR");
        System.out.println("5. Search by FAX number");
        System.out.println("6. Search in a time period for transports");
        System.out.println("7. Save changes");
        System.out.println("8. Read from files");
        System.out.println("9. Print all transports");

    }


    // have to create an operator witch can get an object and then iterate itself
    public static void writeToFileLand(ArrayList<LandTransport> transports) {
        FileUtilities.createFile("Land Transports.txt");
        for (Transport transport : transports) {
            FileUtilities.writeToFile(transport, "Land Transports.txt");
        }
    }

    public static void writeToFileRail(ArrayList<RailTransport> transports) {
        FileUtilities.createFile("Railway Transports.txt");
        for (Transport transport : transports) {
            FileUtilities.writeToFile(transport, "Railway Transports.txt");
        }
    }

    public static void writeToFileAir(ArrayList<AirTransport> transports) {
        FileUtilities.createFile("Air Transports.txt");
        for (Transport transport : transports) {
            FileUtilities.writeToFile(transport, "Air Transports.txt");
        }
    }

    public static void writeToFileSea(ArrayList<SeaAndWaterWayTransport> transports) {
        for (Transport transport : transports) {
            FileUtilities.createFile("Sea Transports.txt");
            FileUtilities.writeToFile(transport, "Sea Transports.txt");
        }
    }
//    --------------------------------------------------------------------------

    //create a method that can read from every .txt file or a recursive method that calls other reading files
    public static void readFile(TransportRepo repo) {
        repo.landTransports = FileUtilities.readFromFile("Land Transports.txt");

//        Transport transportsAir = FileUtilities.readFromFile("Air Transports.txt");
//        Transport transportsRail = FileUtilities.readFromFile("Railway Transports.txt");
//        Transport transportsSea = FileUtilities.readFromFile("Sea Transports.txt");
    }
    // ??????????????????????????????????????????????????????????????????????????????????????????????????????
}
