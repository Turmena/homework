class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    public void displayBookInfo() {
        System.out.println("სათაური: " + title);
        System.out.println("ავტორი: " + author);
        System.out.println("გვერდების რაოდენობა: " + pages);
    }
}
