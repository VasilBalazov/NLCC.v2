public class AirTransport extends Transport{
    String planeType;
    String flightNumber;
    String hourOfEntry;
    String hourOfExit;

    @Override
    public String toString(){
        return (this.planeType + ", " + this.flightNumber + ", " + this.entryPoint+ ", " + this.dateOfEntry
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
