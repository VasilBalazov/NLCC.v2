import java.util.ArrayList;

public class RailTransport extends Transport{

    public RailTransport(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry,
                         String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission,
                         String note, String faxNumber, String TMR) {
        super(startPoint, finalDestination, entryPoint, dateOfEntry, hourOfEntry, exitPoint, dateOfExit, hourOfExit,
                cargo, personal, mission, note, faxNumber, TMR);
    }

    @Override
    public String toString(){
        return (this.startPoint + ", " + this.finalDestination + ", " + this.entryPoint+ ", " + this.dateOfEntry
                + ", " + this.exitPoint + ", " + this.dateOfExit + ", " + this.cargo + ", " + this.personal
                + ", " + this.mission + ", " +  this.note + ", " + this.faxNumber + ", " + this.TMR );
    }

}
