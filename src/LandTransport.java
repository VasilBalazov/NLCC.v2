import java.util.ArrayList;
import java.util.List;

public class LandTransport extends Transports {
    String startDestination;
    String finalDestination;
    String typeOfVehicle;
    String licensePlateNumber;
    String licensePlateNumberTrailer;
    String drivers;

    List<LandTransport> landTransports = new ArrayList<>();

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

    //    ArrayList<Transport> landTransports = new ArrayList<>();// create a constructor and create field
//    public ArrayList<Transport> getLandTransports() {
//        return landTransports;
//    }
//    public void addLandTransport(Transport transport){
//        landTransports.add(transport);
//    }
    public ArrayList<Transport> getLandTransports() {
        return landTransports;
    }

    @Override
    public void add(LandTransport landTransport) {
//                landTransport = new LandTransport(entryPoint,  dateOfEntry,  exitPoint,  dateOfExit ,
//                 cargo,  personal,  mission,  note,  faxNumber,  TMR,
//                  startDestination,  finalDestination,
//                 typeOfVehicle,  licensePlateNumber,  licensePlateNumberTrailer, drivers);
        landTransports.add(landTransport);
    }

    @Override
    public void remove() {

    }

    @Override
    public void changeEntry() {

    }

    @Override
    public void searchByTMR() {

    }

    @Override
    public void searchByFaxNumber() {

    }

    @Override
    public void searchByPeriodOfTime() {

    }

    @Override
    public void searchByMission() {

    }

    @Override
    public void save() {

    }

    @Override
    public void readFromFile() {

    }

    @Override
    public void printAll() {

    }

    @Override
    public void writeToFile() {

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

