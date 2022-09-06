import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {
    public static final String DB_NAME = "transports.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:X:\\InteliJ\\Repositories\\NLCC.v2\\Datasource" + DB_NAME;

    public static final String TABLE_LAND_TRANSPORT = "LandTransports";
    public static final String COLUMN_TRANSPORT_ID = "_id";
    public static final String COLUMN_START_POINT = "startingOfTransport";
    public static final String COLUMN_FINAL_POINT = "endingOfTransport";
    public static final String COLUMN_ENTRY_IN_BGR_POINT = "entryInBGR";
    public static final String COLUMN_DATE_OF_ENTRY_IN_BGR = "EntryDateInBGR";
    public static final String COLUMN_HOUR_OF_ENTRY_IN_BGR = "EntryHourInBGR";
    public static final String COLUMN_EXIT_POINT_FROM_BGR = "exitFromBGR";
    public static final String COLUMN_DATE_OF_EXIT_FROM_BGR = "ExitDateFromBGR";
    public static final String COLUMN_HOUR_OF_EXIT_FROM_BGR = "ExitHourFromBGR";
    public static final String COLUMN_CARGO = "cargo";
    public static final String COLUMN_PERSONAL = "personal";
    public static final String COLUMN_MISSION_TO_SUPPORT = "mission";
    public static final String COLUMN_TYPE_OF_VEHICLES = "typeOfVehicles";
    public static final String COLUMN_LICENSE_PLATE_NUMBERS = "LicensePlatesNumbers";
    public static final String COLUMN_LICENSE_PLATE_NUMBERS_OF_TRAILERS = "LicensePlatesNumbersOfTrailers";
    public static final String COLUMN_DRIVERS = "drivers";
    public static final String COLUMN_NOTE = "note";
    public static final String COLUMN_FAX_NUMBER = "faxNumber";
    public static final String COLUMN_TMR = "transportMissionNumber";
    public static final int INDEX_TRANSPORT_ID = 1;
    public static final int INDEX_START_POINT = 2;
    public static final int INDEX_FINAL_POINT = 3;
    public static final int INDEX_ENTRY_IN_BGR_POINT = 4;
    public static final int INDEX_DATE_OF_ENTRY_IN_BGR = 5;
    public static final int INDEX_HOUR_OF_ENTRY_IN_BGR = 6;
    public static final int INDEX_EXIT_POINT_FROM_BGR = 7;
    public static final int INDEX_DATE_OF_EXIT_FROM_BGR = 8;
    public static final int INDEX_HOUR_OF_EXIT_FROM_BGR = 9;
    public static final int INDEX_CARGO = 10;
    public static final int INDEX_PERSONAL = 11;
    public static final int INDEX_MISSION_TO_SUPPORT = 12;
    public static final int INDEX_TYPE_OF_VEHICLES = 13;
    public static final int INDEX_LICENSE_PLATE_NUMBERS = 14;
    public static final int INDEX_LICENSE_PLATE_NUMBERS_OF_TRAILERS = 15;
    public static final int INDEX_DRIVERS = 16;
    public static final int INDEX_NOTE = 17;
    public static final int INDEX_FAX_NUMBER = 18;
    public static final int INDEX_TMR = 19;
    private Connection conn;

    public boolean open(){
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e){
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void createLandTransportTable () {
        try (Statement statement = conn.createStatement()){
            StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
            sb.append(TABLE_LAND_TRANSPORT + " (");
            sb.append(COLUMN_TRANSPORT_ID + " INTEGER, ");
            sb.append(COLUMN_START_POINT + " TEXT, ");
            sb.append(COLUMN_FINAL_POINT + " TEXT, ");
            sb.append(COLUMN_ENTRY_IN_BGR_POINT + " TEXT, ");
            sb.append(COLUMN_DATE_OF_ENTRY_IN_BGR + " TEXT, ");
            sb.append(COLUMN_HOUR_OF_ENTRY_IN_BGR + " TEXT, ");
            sb.append(COLUMN_EXIT_POINT_FROM_BGR + " TEXT, ");
            sb.append(COLUMN_DATE_OF_EXIT_FROM_BGR + " TEXT, ");
            sb.append(COLUMN_HOUR_OF_EXIT_FROM_BGR + " TEXT, ");
            sb.append(COLUMN_CARGO + " TEXT, ");
            sb.append(COLUMN_PERSONAL + " TEXT, ");
            sb.append(COLUMN_MISSION_TO_SUPPORT + " TEXT, ");
            sb.append(COLUMN_TYPE_OF_VEHICLES + " TEXT, ");
            sb.append(COLUMN_LICENSE_PLATE_NUMBERS + " TEXT, ");
            sb.append(COLUMN_LICENSE_PLATE_NUMBERS_OF_TRAILERS + " TEXT, ");
            sb.append(COLUMN_DRIVERS + " TEXT, ");
            sb.append(COLUMN_NOTE + " TEXT, ");
            sb.append(COLUMN_FAX_NUMBER + " TEXT, ");
            sb.append(COLUMN_TMR + " TEXT)");
            statement.execute(sb.toString());
//            statement.close();
//            conn.close();
        }catch (SQLException e){
            System.out.println("Something went wrong with creating land transport DB" + e.getMessage());
        }
    }

    public void manualInsert (){
        try (Statement statement = conn.createStatement()){
            statement.execute("INSERT INTO " + TABLE_LAND_TRANSPORT + " (" + COLUMN_TRANSPORT_ID + ", " + COLUMN_START_POINT
                    + ", " + COLUMN_FINAL_POINT + ", " + COLUMN_ENTRY_IN_BGR_POINT + ", " + COLUMN_DATE_OF_ENTRY_IN_BGR + ", " + COLUMN_HOUR_OF_ENTRY_IN_BGR
                    + ", " + COLUMN_EXIT_POINT_FROM_BGR + ", " + COLUMN_DATE_OF_EXIT_FROM_BGR + ", " + COLUMN_HOUR_OF_EXIT_FROM_BGR
                    + ", " + COLUMN_CARGO + ", " + COLUMN_PERSONAL + ", " + COLUMN_MISSION_TO_SUPPORT + ", " + COLUMN_TYPE_OF_VEHICLES + ", " + COLUMN_LICENSE_PLATE_NUMBERS
                    + ", " + COLUMN_LICENSE_PLATE_NUMBERS_OF_TRAILERS + ", " + COLUMN_DRIVERS + ", " + COLUMN_NOTE + ", " + COLUMN_FAX_NUMBER + ", " + COLUMN_TMR +
                    ") VALUES(" + "'6', 'Romania', 'Bulgaria', 'Ruse', '04-09-2022', '1300', 'Novo Selo', '06-09-2022', '1200', 'supplies', '4'," +
                    "'support', 'car', 'dew22313', 'daa22231', '2', 'none', '260 005', 'rsr532')");
            System.out.println("insert successful");
        } catch (SQLException e){
            System.out.println("Manual insert has failed!" + e.getMessage());
        }
    }

    public List<LandTransport> queryLandTransportsList (){


        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_LAND_TRANSPORT)) {

            List<LandTransport> landTransports = new  ArrayList<>();
            while (results.next()){
                LandTransport landTransport = new LandTransport(results.getString(INDEX_START_POINT) ,results.getString(INDEX_FINAL_POINT),
                        results.getString(INDEX_ENTRY_IN_BGR_POINT), results.getString(INDEX_DATE_OF_ENTRY_IN_BGR), results.getString(INDEX_HOUR_OF_ENTRY_IN_BGR),
                        results.getString(INDEX_EXIT_POINT_FROM_BGR), results.getString(INDEX_DATE_OF_EXIT_FROM_BGR), results.getString(INDEX_HOUR_OF_EXIT_FROM_BGR),
                        results.getString(INDEX_CARGO), results.getString(INDEX_PERSONAL), results.getString(INDEX_MISSION_TO_SUPPORT),
                        results.getString(INDEX_TYPE_OF_VEHICLES),results.getString(INDEX_LICENSE_PLATE_NUMBERS), results.getString(INDEX_LICENSE_PLATE_NUMBERS_OF_TRAILERS),
                        results.getString(INDEX_DRIVERS),results.getString(INDEX_NOTE), results.getString(INDEX_FAX_NUMBER),results.getString(INDEX_TMR));
                landTransports.add(landTransport);
            }
            return landTransports;
        } catch (SQLException e){
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
    public void close () {
        try {
            if (conn != null){
                conn.close();
            }
        } catch (SQLException e){
            System.out.println("Couldn't close connection " + e.getMessage());
        }
    }
}
