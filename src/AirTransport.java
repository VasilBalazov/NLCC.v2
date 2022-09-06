import java.util.ArrayList;

public class AirTransport extends Transport {
    String planeType;
    String flightNumber;
    String hourOfEntry;
    String hourOfExit;

    public AirTransport(String startPoint, String finalDestination, String entryPoint, String dateOfEntry,
                        String exitPoint, String dateOfExit, String cargo, String personal, String mission,
                        String note, String faxNumber, String TMR, String planeType, String flightNumber,
                        String hourOfEntry, String hourOfExit) {
        super(startPoint, finalDestination, entryPoint, dateOfEntry, hourOfEntry, exitPoint, dateOfExit, hourOfExit, cargo, personal, mission, note, faxNumber, TMR);
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.hourOfEntry = hourOfEntry;
        this.hourOfExit = hourOfExit;
    }

    @Override
    public String toString(){
        return (this.startPoint + ", " + this.finalDestination + ", " + this.planeType + ", " + this.flightNumber + ", " + this.entryPoint+ ", " + this.dateOfEntry
                + ", " + this.hourOfEntry + ", " + this.exitPoint + ", " + this.dateOfExit+ ", " + this.hourOfExit
                + ", " + this.cargo + ", " + this.personal
                + ", " + this.mission + ", " + this.note + ", " + this.faxNumber + ", " + this.TMR );
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getHourOfEntry() {
        return hourOfEntry;
    }

    public void setHourOfEntry(String hourOfEntry) {
        this.hourOfEntry = hourOfEntry;
    }


    public String getHourOfExit() {
        return hourOfExit;
    }

    public void setHourOfExit(String hourOfExit) {
        this.hourOfExit = hourOfExit;
    }
}
