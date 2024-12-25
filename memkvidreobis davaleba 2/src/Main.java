import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new AdventureBook("Treasure Island", 300, "Robert Louis Stevenson", true));
        books.add(new ScienceBook("A Brief History of Time", 256, "Stephen Hawking", false, "Physics"));
        books.add(new FantasyBook("The Hobbit", 310, "J.R.R. Tolkien", true, "Middle-earth"));

        List<Employee> employees = new ArrayList<>();
        Library library = new Library("City Library", employees, books);

        BookAdvisor advisor = new BookAdvisor("Alice", "Smith", "E123", 4.8, library);
        employees.add(advisor);

        Book recommendedBook = advisor.recommendBook();
        System.out.println("Recommended book: " + recommendedBook.getTitle());
    }
}
