import java.util.ArrayList;
import java.util.Scanner;

public class TransportRepo {
    ArrayList<LandTransport> landTransports = new ArrayList<>();
    ArrayList<RailTransport> railTransports = new ArrayList<>();
    ArrayList<AirTransport> airTransports = new ArrayList<>();
    ArrayList<SeaAndWaterWayTransport> seaTransports = new ArrayList<>();

    public void increaseLT() {
        landTransports.add(addLandTransport());
    }

    public void increaseLT(LandTransport TransportL) {
        landTransports.add(TransportL);
    }

    public void increaseRT() {
        railTransports.add(addRailTransport());
    }

    public void increaseAT() {
        airTransports.add(addAirTransport());
    }

    public void increaseST() {
        seaTransports.add(addSeaTransport());
    }

    public static LandTransport addLandTransport() {
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
        String TMR =scan.nextLine();

        return new LandTransport(startingDestination, finalDestination, entryPoint, dateOfEntry,
                exitPoint, dateOfExit, cargo, personal, mission, typeOfVehicle, licensePlateNumber,
                licensePlateNumberTrailer, drivers, note, faxNumber, TMR);
    }

    public static RailTransport addRailTransport() {
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
        return new RailTransport(startingDestination, finalDestination, entryPoint, dateOfEntry,
                exitPoint, dateOfExit, cargo, personal, mission, note, faxNumber, TMR);
    }

    public static AirTransport addAirTransport() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting point: ");
        String startingDestination = scan.nextLine();
        System.out.print("Enter final destination: ");
        String finalDestination = scan.nextLine();
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
        return new AirTransport(startingDestination, finalDestination, entryPoint, dateOfEntry, exitPoint,
                dateOfExit, cargo, personal, mission, note, faxNumber, TMR, planeType, flightNumber, hourOfEntry, hourOfExit);
    }

    public static SeaAndWaterWayTransport addSeaTransport() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting point: ");
        String startingDestination = scan.nextLine();
        System.out.print("Enter final destination: ");
        String finalDestination = scan.nextLine();
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
        return new SeaAndWaterWayTransport(startingDestination, finalDestination, entryPoint, dateOfEntry, exitPoint,
                dateOfExit, cargo, personal, mission, note, faxNumber, TMR, shipType, shipName, hourOfEntry, hourOfExit, weight);
    }

    public void searchByTMR(ArrayList<LandTransport> landTransports, String number) {
//        landTransports.forEach(landTransport -> landTransport.getTMR().equals(number));
        for (LandTransport landTransport : landTransports) {
            if (number.equals(landTransport.getTMR())){
                System.out.println(landTransport);
            }
        }
     }

    public void removeByTMR(ArrayList<LandTransport> landTransports, String TMR) {
        int index = 0;
        boolean isTrue = false;
        for (LandTransport landTransport : landTransports) {
            if (landTransport.getTMR().equals(TMR)){
                landTransports.remove(index);
                isTrue = true;

            }
            if (isTrue){
                break;
            }
            index++;
        }
    }
}