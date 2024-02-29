public class Book {

    private final String nameBook;

    public final Author author;

    private int yearPublication;


    public Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return this.nameBook;

    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }


}
