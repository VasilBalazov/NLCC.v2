import java.util.ArrayList;

public class RailTransport extends Transport{
    String startDestination;
    String finalDestination;

    ArrayList<Transport> railTransports = new ArrayList<>();// create a constructor and create field

    public ArrayList<Transport> getRailTransports() {
        return railTransports;
    }
    public void addRailTransport(Transport transport){
        railTransports.add(transport);
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

    @Override
    public String toString(){
        return (this.startDestination + ", " + this.finalDestination + ", " + this.entryPoint+ ", " + this.dateOfEntry
                + ", " + this.exitPoint + ", " + this.dateOfExit + ", " + this.cargo + ", " + this.personal
                + ", " + this.mission + ", " +  this.note + ", " + this.faxNumber + ", " + this.TMR );
    }

}
