abstract class Employee {
    String firstName, lastName, phone;

    public Employee(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public abstract double salary();
}
