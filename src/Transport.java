public abstract class Transport {
    String startPoint;
    String finalDestination;
    String entryPoint;
    String dateOfEntry;
    String exitPoint;
    String dateOfExit;
    String cargo;
    String personal;
    String mission;
    String note;
    String faxNumber;
    String TMR;

    public Transport(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String exitPoint,
                     String dateOfExit, String cargo, String personal, String mission,
                     String note, String faxNumber, String TMR) {
        this.setStartPoint(startPoint);
        this.setFinalDestination(finalDestination);
        this.setEntryPoint(entryPoint);
        this.setDateOfEntry(dateOfEntry);
        this.setExitPoint(exitPoint);
        this.setDateOfExit(dateOfExit);
        this.setCargo(cargo);
        this.setPersonal(personal);
        this.setMission(mission);
        this.setNote(note);
        this.setFaxNumber(faxNumber);
        this.setTMR(TMR);
    }



    public String getStartPoint() {
        return startPoint;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public String getExitPoint() {
        return exitPoint;
    }

    public String getDateOfExit() {
        return dateOfExit;
    }

    public String getCargo() {
        return cargo;
    }

    public String getPersonal() {
        return personal;
    }

    public String getMission() {
        return mission;
    }

    public String getNote() {
        return note;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getTMR() {
        return TMR;
    }



    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public void setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public void setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
    }

    public void setDateOfExit(String dateOfExit) {
        this.dateOfExit = dateOfExit;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public void setTMR(String TMR) {
        this.TMR = TMR;
    }


}