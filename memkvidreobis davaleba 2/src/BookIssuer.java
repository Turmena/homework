class BookIssuer extends Employee {
    private String startTime;
    private String endTime;

    public BookIssuer(String firstName, String lastName, String id, String startTime, String endTime) {
        super(firstName, lastName, id);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return super.toString() + ", BookIssuer{startTime='" + startTime + "', endTime='" + endTime + "'}";
    }
}
