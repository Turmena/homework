import java.util.List;

class Library {
    private String name;
    private List<Employee> employees;
    private List<Book> books;

    public Library(String name, List<Employee> employees, List<Book> books) {
        this.name = name;
        this.employees = employees;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{name='" + name + "', employees=" + employees + ", books=" + books + "}";
    }
}
