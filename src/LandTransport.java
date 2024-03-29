import org.w3c.dom.ls.LSOutput;

public class LandTransport extends Transport {

    String typeOfVehicle;
    String licensePlateNumber;
    String licensePlateNumberTrailer;
    String drivers;

    public LandTransport(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry,
                         String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission,
                         String note, String faxNumber, String TMR, String typeOfVehicle, String licensePlateNumber,
                         String licensePlateNumberTrailer, String drivers) {
        super(startPoint, finalDestination, entryPoint, dateOfEntry, hourOfEntry, exitPoint, dateOfExit, hourOfExit,
                cargo, personal, mission, note, faxNumber, TMR);
        this.typeOfVehicle = typeOfVehicle;
        this.licensePlateNumber = licensePlateNumber;
        this.licensePlateNumberTrailer = licensePlateNumberTrailer;
        this.drivers = drivers;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getLicensePlateNumberTrailer() {
        return licensePlateNumberTrailer;
    }

    public void setLicensePlateNumberTrailer(String licensePlateNumberTrailer) {
        this.licensePlateNumberTrailer = licensePlateNumberTrailer;
    }

    public String getDrivers() {
        return drivers;
    }

    public void setDrivers(String drivers) {
        this.drivers = drivers;
    }





    @Override
    public String toString(){
        String transportInfo = String.format("%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s%n", startPoint, finalDestination, entryPoint, dateOfEntry,
                exitPoint, dateOfExit, cargo, personal, mission, typeOfVehicle, licensePlateNumber, licensePlateNumberTrailer, drivers, note, faxNumber, TMR);
        transportInfo = transportInfo.replaceAll("\\[", "").replaceAll("\\]","");
        return transportInfo;
//        return this.startPoint + ", " + this.finalDestination + ", " + this.entryPoint + ", " + this.dateOfEntry
//                + ", " + this.exitPoint + ", " + this.dateOfExit + ", " + this.cargo + ", " + this.personal
//                + ", " + this.mission + ", " + this.typeOfVehicle
//                + ", " + this.licensePlateNumber + ", " + this.licensePlateNumberTrailer + ", " +
//                this.drivers + ", " + this.note + ", " + this.faxNumber + ", " + this.TMR;
    }
}