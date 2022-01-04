import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        menu();

        Transports transports = new Transports();

        boolean run = true;
        while(run){
            switch (scan.nextLine()){
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
                    switch (selector){
                        case "a":
                            Transport transport = addLandTransport();
                            transports.addLandTransport(transport);
                            break;
                        case "b":
                            Transport transportRail = addRailTransport();
                            transports.addRailTransport(transportRail);
                            break;
                        case "c":
                            Transport transportAir = addAirTransport();
                            transports.addAirTransport(transportAir);
                            break;
                        case "d":
                            Transport transportSea = addSeaTransport();
                            transports.addSeaTransport(transportSea);
                            break;
                    }
                    break;
                case "2": break;
                case "3": break;
                case "4": break;
                case "5": break;
                case "6": break;
                case "7":
                    writeToFile(transports);
                    break;
                case "8":
                    //read
                    break;
                case "9": break;
            }
        }
    }
    public static void menu(){
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

    public static Transport addLandTransport(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting point: ");
        String startingDestination = scan.nextLine();
        System.out.print("Enter final destination: ");
        String finalDestination = scan.nextLine();
        System.out.print("Enter entry BXP/home base: ");
        String entryPoint = scan.nextLine();
        System.out.print("Enter date of entry in Bulgaria: ");
        String dateOfEntry = scan.nextLine();
        System.out.print("Enter BXP/final destination: ");
        String exitPoint = scan.nextLine();
        System.out.print("Enter day of border crossing/reaching final destination: ");
        String dateOfExit = scan.nextLine();
        System.out.print("Enter cargo: ");
        String cargo = scan.nextLine();
        System.out.print("Enter personal: ");
        String personal = scan.nextLine();
        System.out.print("Enter name of mission: ");
        String mission = scan.nextLine();
        System.out.print("Enter type/s of vehicle: ");
        String typeOfVehicle = scan.nextLine();
        System.out.print("Enter license plate number/s: ");
        String licensePlateNumber = scan.nextLine();
        System.out.print("Enter license plate number/s of trailer/s: ");
        String licensePlateNumberTrailer = scan.nextLine();
        System.out.print("Enter driver/s name/s: ");
        String drivers = scan.nextLine();
        System.out.print("Enter note: ");
        String note = scan.nextLine();
        System.out.print("Enter FAX number: ");
        String faxNumber = scan.nextLine();
        System.out.print("Enter TMR: ");
        String TMR = scan.nextLine();
        LandTransport transport = new LandTransport();
        transport.setStartDestination(startingDestination);
        transport.setFinalDestination(finalDestination);
        transport.setEntryPoint(entryPoint);
        transport.setDateOfEntry(dateOfEntry);
        transport.setExitPoint(exitPoint);
        transport.setDateOfExit(dateOfExit);
        transport.setCargo(cargo);
        transport.setPersonal(personal);
        transport.setMission(mission);
        transport.setTypeOfVehicle(typeOfVehicle);
        transport.setLicensePlateNumber(licensePlateNumber);
        transport.setLicensePlateNumberTrailer(licensePlateNumberTrailer);
        transport.setDrivers(drivers);
        transport.setNote(note);
        transport.setFaxNumber(faxNumber);
        transport.setTMR(TMR);
        return transport;
    }
    public static Transport addRailTransport(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting point: ");
        String startingDestination = scan.nextLine();
        System.out.print("Enter final destination: ");
        String finalDestination = scan.nextLine();
        System.out.print("Enter entry BXP/home base: ");
        String entryPoint = scan.nextLine();
        System.out.print("Enter date of entry in Bulgaria: ");
        String dateOfEntry = scan.nextLine();
        System.out.print("Enter BXP/final destination: ");
        String exitPoint = scan.nextLine();
        System.out.print("Enter day of border crossing/reaching final destination: ");
        String dateOfExit = scan.nextLine();
        System.out.print("Enter cargo: ");
        String cargo = scan.nextLine();
        System.out.print("Enter personal: ");
        String personal = scan.nextLine();
        System.out.print("Enter name of mission: ");
        String mission = scan.nextLine();
        System.out.print("Enter note: ");
        String note = scan.nextLine();
        System.out.print("Enter FAX number: ");
        String faxNumber = scan.nextLine();
        System.out.print("Enter TMR: ");
        String TMR = scan.nextLine();
        RailTransport transport = new RailTransport();
        transport.setStartDestination(startingDestination);
        transport.setFinalDestination(finalDestination);
        transport.setEntryPoint(entryPoint);
        transport.setDateOfEntry(dateOfEntry);
        transport.setExitPoint(exitPoint);
        transport.setDateOfExit(dateOfExit);
        transport.setCargo(cargo);
        transport.setPersonal(personal);
        transport.setMission(mission);
        transport.setNote(note);
        transport.setFaxNumber(faxNumber);
        transport.setTMR(TMR);
        return transport;
    }
    public static Transport addAirTransport(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter plain type: ");
        String planeType = scan.nextLine();
        System.out.print("Enter flight number: ");
        String flightNumber = scan.nextLine();
        System.out.print("Enter entry airfield for landing: ");
        String entryPoint = scan.nextLine();
        System.out.print("Enter date of entry in Bulgaria: ");
        String dateOfEntry = scan.nextLine();
        System.out.print("Enter hour of landing in Bulgaria: ");
        String hourOfEntry = scan.nextLine();
        System.out.print("Enter airfield for takeoff: ");
        String exitPoint = scan.nextLine();
        System.out.print("Enter date of takeoff: ");
        String dateOfExit = scan.nextLine();
        System.out.print("Enter hour of takeoff: ");
        String hourOfExit = scan.nextLine();
        System.out.print("Enter cargo: ");
        String cargo = scan.nextLine();
        System.out.print("Enter personal: ");
        String personal = scan.nextLine();
        System.out.print("Enter name of mission: ");
        String mission = scan.nextLine();
        System.out.print("Enter note: ");
        String note = scan.nextLine();
        System.out.print("Enter FAX number: ");
        String faxNumber = scan.nextLine();
        System.out.print("Enter TMR: ");
        String TMR = scan.nextLine();
        AirTransport transport = new AirTransport();
        transport.setPlaneType(planeType);
        transport.setFlightNumber(flightNumber);
        transport.setEntryPoint(entryPoint);
        transport.setDateOfEntry(dateOfEntry);
        transport.setHourOfEntry(hourOfEntry);
        transport.setExitPoint(exitPoint);
        transport.setDateOfExit(dateOfExit);
        transport.setHourOfExit(hourOfExit);
        transport.setCargo(cargo);
        transport.setPersonal(personal);
        transport.setMission(mission);
        transport.setNote(note);
        transport.setFaxNumber(faxNumber);
        transport.setTMR(TMR);
        return transport;
    }
    public static Transport addSeaTransport(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ship type: ");
        String shipType = scan.nextLine();
        System.out.print("Enter ship name: ");
        String shipName = scan.nextLine();
        System.out.print("Enter port of entry: ");
        String entryPoint = scan.nextLine();
        System.out.print("Enter date of entry in Bulgaria: ");
        String dateOfEntry = scan.nextLine();
        System.out.print("Enter hour of entering the port in Bulgaria: ");
        String hourOfEntry = scan.nextLine();
        System.out.print("Enter port of debarkation: ");
        String exitPoint = scan.nextLine();
        System.out.print("Enter date of debarkation: ");
        String dateOfExit = scan.nextLine();
        System.out.print("Enter hour of debarkation: ");
        String hourOfExit = scan.nextLine();
        System.out.print("Enter cargo: ");
        String cargo = scan.nextLine();
        System.out.print("Enter personal: ");
        String personal = scan.nextLine();
        System.out.print("Enter weight: ");
        String weight = scan.nextLine();
        System.out.print("Enter name of mission: ");
        String mission = scan.nextLine();
        System.out.print("Enter note: ");
        String note = scan.nextLine();
        System.out.print("Enter FAX number: ");
        String faxNumber = scan.nextLine();
        System.out.print("Enter TMR: ");
        String TMR = scan.nextLine();
        SeaAndWaterWayTransport transport = new SeaAndWaterWayTransport();
        transport.setShipType(shipType);
        transport.setShipName(shipName);
        transport.setEntryPoint(entryPoint);
        transport.setDateOfEntry(dateOfEntry);
        transport.setHourOfEntry(hourOfEntry);
        transport.setEntryPoint(exitPoint);
        transport.setDateOfExit(dateOfExit);
        transport.setHourOfExit(hourOfExit);
        transport.setCargo(cargo);
        transport.setPersonal(personal);
        transport.setWeight(weight);
        transport.setMission(mission);
        transport.setNote(note);
        transport.setFaxNumber(faxNumber);
        transport.setTMR(TMR);
        return transport;
    }

    public static void writeToFile (Transports transports){
        FileUtilities.createFile("Transports.txt");
        FileUtilities.writeToFile(transports, "Transports.txt");
    }

    public static Transports readFile (){
        Transports transports = FileUtilities.readFromFile("Transports.txt");
        return transports;
    }

}
