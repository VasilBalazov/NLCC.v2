public interface Transport {
    void add(LandTransport landTransport);
    void remove();
    void changeEntry();
    void searchByTMR();
    void searchByFaxNumber();
    void searchByPeriodOfTime();
    void searchByMission();
    void save();
    void readFromFile();
    void printAll();
    void writeToFile();

}
