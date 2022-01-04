import java.util.ArrayList;
import java.util.List;

public class Transports {
    ArrayList<Transport> landTransports = new ArrayList<>();
    ArrayList<Transport> railTransports = new ArrayList<>();
    ArrayList<Transport> airTransports = new ArrayList<>();
    ArrayList<Transport> seaTransports = new ArrayList<>();

    public ArrayList<Transport> getLandTransports() {
        return landTransports;
    }

    public ArrayList<Transport> getRailTransports() {
        return railTransports;
    }

    public ArrayList<Transport> getAirTransports() {
        return airTransports;
    }

    public ArrayList<Transport> getSeaTransports() {
        return seaTransports;
    }

    public void addLandTransport(Transport transport){
        landTransports.add(transport);
    }
    public void addRailTransport(Transport transport){
        railTransports.add(transport);
    }
    public void addAirTransport(Transport transport){
        airTransports.add(transport);
    }
    public void addSeaTransport(Transport transport){
        seaTransports.add(transport);
    }


}
