import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtilities {
    //create a file
    public static void createFile(String fileName){
        try {
            File transports = new File(fileName);
            if (transports.createNewFile()){
                System.out.println("File for transports is created");
            }else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    //write on file
    public static void writeToFile(Transport transports, String fileName){
        try{
            FileWriter writer = new FileWriter(fileName);
            for (Transport transport: LandTransport.getLandTransports()) {

            }
            for (Transport transport: LandTransport.getLandTransports()) {
                writer.write(transport.toString());//wrong toString method
                writer.write("\n");
            }
            for (Transport transport: transports.getRailTransports()) {
                writer.write(transport.toString());//wrong toString method
                writer.write("\n");
            }
            for (Transport transport: transports.getAirTransports()) {
                writer.write(transport.toString()); //wrong toString method
                writer.write("\n");
            }
            for (Transport transport: transports.getSeaTransports()) {
                writer.write(transport.toString());//wrong toString method
                writer.write("\n");
            }
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    //read file
    public static Transport readFromFile(String fileName){
        Transport transports = new Transport();
        try{
            FileReader reader = new FileReader(fileName);
            Scanner myTransportReader = new Scanner(reader);
            while (myTransportReader.hasNextLine()){
                String data = myTransportReader.nextLine();
                String[] result = data.split(", ");
                switch (result.length){
                    case 16:
                        // road
                        LandTransport landTransport = new LandTransport(result[0], result[1],result[2],result[3],result[4],
                        result[5],result[6],result[7],result[8],result[9],result[10],result[11],result[12],result[13],result[14],
                        result[15]);
//                        landTransport.setStartDestination(result[0]);
//                        landTransport.setFinalDestination(result[1]);
//                        landTransport.setEntryPoint(result[2]);
//                        landTransport.setDateOfEntry(result[3]);
//                        landTransport.setExitPoint(result[4]);
//                        landTransport.setDateOfExit(result[5]);
//                        landTransport.setCargo(result[6]);
//                        landTransport.setPersonal(result[7]);
//                        landTransport.setMission(result[8]);
//                        landTransport.setTypeOfVehicle(result[9]);
//                        landTransport.setLicensePlateNumber(result[10]);
//                        landTransport.setLicensePlateNumberTrailer(result[11]);
//                        landTransport.setDrivers(result[12]);
//                        landTransport.setNote(result[13]);
//                        landTransport.setFaxNumber(result[14]);
//                        landTransport.setTMR(result[15]);
                        transports.add(landTransport);
                        break;
//                    case 12:
                        //rail
//                        RailTransport railTransport = new RailTransport();
//                        railTransport.setStartDestination(result[0]);
//                        railTransport.setFinalDestination(result[1]);
//                        railTransport.setEntryPoint(result[2]);
//                        railTransport.setDateOfEntry(result[3]);
//                        railTransport.setExitPoint(result[4]);
//                        railTransport.setDateOfExit(result[5]);
//                        railTransport.setCargo(result[6]);
//                        railTransport.setPersonal(result[7]);
//                        railTransport.setMission(result[8]);
//                        railTransport.setNote(result[9]);
//                        railTransport.setFaxNumber(result[10]);
//                        railTransport.setTMR(result[11]);
//                        transports.addRailTransport(railTransport);
//                        break;
//                    case 14:
//                        //air
//                        AirTransport airTransport = new AirTransport();
//                        airTransport.setPlaneType(result[0]);
//                        airTransport.setFlightNumber(result[1]);
//                        airTransport.setEntryPoint(result[2]);
//                        airTransport.setDateOfEntry(result[3]);
//                        airTransport.setHourOfEntry(result[4]);
//                        airTransport.setExitPoint(result[5]);
//                        airTransport.setDateOfExit(result[6]);
//                        airTransport.setHourOfExit(result[7]);
//                        airTransport.setCargo(result[8]);
//                        airTransport.setPersonal(result[9]);
//                        airTransport.setMission(result[10]);
//                        airTransport.setNote(result[11]);
//                        airTransport.setFaxNumber(result[12]);
//                        airTransport.setTMR(result[13]);
//                        transports.addAirTransport(airTransport);
//                        break;
//                    case 15:
//                        //sea
//                        SeaAndWaterWayTransport seaTransport = new SeaAndWaterWayTransport();
//                        seaTransport.setShipType(result[0]);
//                        seaTransport.setShipName(result[1]);
//                        seaTransport.setEntryPoint(result[2]);
//                        seaTransport.setDateOfEntry(result[3]);
//                        seaTransport.setHourOfEntry(result[4]);
//                        seaTransport.setEntryPoint(result[5]);
//                        seaTransport.setDateOfExit(result[6]);
//                        seaTransport.setHourOfExit(result[7]);
//                        seaTransport.setCargo(result[8]);
//                        seaTransport.setPersonal(result[9]);
//                        seaTransport.setWeight(result[10]);
//                        seaTransport.setMission(result[11]);
//                        seaTransport.setNote(result[12]);
//                        seaTransport.setFaxNumber(result[13]);
//                        seaTransport.setTMR(result[14]);
//                        break;
                }
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return transports;
    }
}
