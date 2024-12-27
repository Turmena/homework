class FixedSalaryEmployee extends Employee {
    double salary;

    public FixedSalaryEmployee(String firstName, String lastName, String phone, double salary) {
        super(firstName, lastName, phone);
        this.salary = salary;
    }

    @Override
    public double salary() {
        return salary;
    }
}
