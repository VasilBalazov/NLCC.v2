public class LandTransport extends Transport {
    String startDestination;
    String finalDestination;
    String typeOfVehicle;
    String licensePlateNumber;
    String licensePlateNumberTrailer;
    String drivers;

    public LandTransport(String entryPoint, String dateOfEntry, String exitPoint, String dateOfExit ,
                         String cargo, String personal, String mission, String note, String faxNumber, String TMR,
                          String startDestination, String finalDestination,
                         String typeOfVehicle, String licensePlateNumber, String licensePlateNumberTrailer,
                         String drivers) {
        super(entryPoint, dateOfEntry, exitPoint, dateOfExit, cargo, personal, mission,
                note, faxNumber, TMR);
        this.setStartDestination(startDestination);
        this.setFinalDestination(finalDestination);
        this.setTypeOfVehicle(typeOfVehicle);
        this.setLicensePlateNumber(licensePlateNumber);
        this.setLicensePlateNumber(licensePlateNumberTrailer);
        this.setDrivers(drivers);

    }

    public String getStartDestination() {
        return startDestination;
    }

    public void setStartDestination(String startDestination) {
        this.startDestination = startDestination;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
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




//
//    @Override
//    public String toString(){
//       return (this.startDestination + ", " + this.finalDestination + ", "+ this.entryPoint+ ", " + this.dateOfEntry
//               + ", " + this.exitPoint + ", " + this.dateOfExit + ", " + this.cargo + ", " + this.personal
//               + ", " + this.mission + ", " + this.typeOfVehicle
//               + ", " + this.licensePlateNumber + ", " + this.licensePlateNumberTrailer + ", " +
//               this.drivers + ", " + this.note + ", " + this.faxNumber + ", " + this.TMR );
    }

