import java.util.ArrayList;

public class SeaAndWaterWayTransport extends Transport{
    String shipType;
    String shipName;
    String hourOfEntry;
    String hourOfExit;
    String weight;

    public SeaAndWaterWayTransport(String startPoint, String finalDestination, String entryPoint, String dateOfEntry,
                                   String exitPoint, String dateOfExit, String cargo, String personal, String mission,
                                   String note, String faxNumber, String TMR, String shipType, String shipName,
                                   String hourOfEntry, String hourOfExit, String weight) {
        super(startPoint, finalDestination, entryPoint, dateOfEntry, exitPoint, dateOfExit,
                cargo, personal, mission, note, faxNumber, TMR);
        this.shipType = shipType;
        this.shipName = shipName;
        this.hourOfEntry = hourOfEntry;
        this.hourOfExit = hourOfExit;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return (this.startPoint + ", " + this.finalDestination + ", " + this.shipType + ", " + this.shipName + ", "+ this.entryPoint+ ", " + this.dateOfEntry + ", "+ this.hourOfEntry
                + ", " + this.exitPoint + ", " + this.dateOfExit + ", "+ this.hourOfExit + ", " + this.cargo
                + ", " + this.personal + ", " + this.weight + ", " + this.mission
                 + ", " + this.note + ", " + this.faxNumber + ", " + this.TMR );
    }
    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

}
