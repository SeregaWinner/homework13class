import java.util.Objects;

public class Book {

    private final String nameBook;

    private final Author author;

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
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Название книги: " + nameBook + ". Автор книги: " + author.toString() +
                ". Год публикации: " + yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return getYearPublication() == book.getYearPublication() && Objects.equals(getNameBook(),
                book.getNameBook()) && Objects.equals(getAuthor(), book.getAuthor());

    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameBook(), getAuthor(), getYearPublication());
    }
}
