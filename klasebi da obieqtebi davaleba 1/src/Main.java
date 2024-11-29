public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "Ryan Gosling", 450);
        book1.displayBookInfo();

        Book book2 = new Book("Python Basics", "Christian Bale");
        book2.displayBookInfo();

        Rectangle rectangle = new Rectangle(10.5, 20.0);
        System.out.println("პერიმეტრი: " + rectangle.perimeter());
        System.out.println("ფართობი: " + rectangle.area());
        System.out.println("დიაგონალი: " + rectangle.diagonal());
        System.out.println("კვადრატია?: " + rectangle.isSquare());
        
        Time time = new Time(14, 30, 45);
        time.displayTime();
    }
}
