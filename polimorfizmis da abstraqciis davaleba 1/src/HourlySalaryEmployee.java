class HourlySalaryEmployee extends Employee {
    int daysWorked;
    double dailySalary;

    public HourlySalaryEmployee(String firstName, String lastName, String phone, int daysWorked, double dailySalary) {
        super(firstName, lastName, phone);
        this.daysWorked = daysWorked;
        this.dailySalary = dailySalary;
    }

    @Override
    public double salary() {
        return daysWorked * dailySalary;
    }
}
