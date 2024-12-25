class ScienceBook extends Book {
    private String field;

    public ScienceBook(String title, int pages, String author, boolean isHardcover, String field) {
        super(title, pages, author, isHardcover);
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return super.toString() + ", ScienceBook{field='" + field + "'}";
    }
}
