import java.util.List;
import java.util.Random;

class BookAdvisor extends Employee {
    private double adviceRating;
    private Library library;

    public BookAdvisor(String firstName, String lastName, String id, double adviceRating, Library library) {
        super(firstName, lastName, id);
        this.adviceRating = adviceRating;
        this.library = library;
    }

    public double getAdviceRating() {
        return adviceRating;
    }

    public void setAdviceRating(double adviceRating) {
        this.adviceRating = adviceRating;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Book recommendBook() {
        List<Book> books = library.getBooks();
        Random random = new Random();
        return books.get(random.nextInt(books.size()));
    }

    @Override
    public String toString() {
        return super.toString() + ", BookAdvisor{adviceRating=" + adviceRating + ", library=" + library.getName() + "}";
    }
}
