public class SeaAndWaterWayTransport extends Transport{
    String shipType;
    String shipName;
    String hourOfEntry;
    String hourOfExit;
    String weight;

    @Override
    public String toString(){
        return (this.shipType + ", " + this.shipName + ", "+ this.entryPoint+ ", " + this.dateOfEntry + ", "+ this.hourOfEntry
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
