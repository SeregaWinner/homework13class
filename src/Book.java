public class Book {
    private final String nameBook;
    private final Author author;
    private final int yearPublication;
    private int i;

    public Book (String nameBook, Author author, int yearPublication){
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getNameBook(){
        return this.nameBook;

    }

    public int getYearPublication() {
        return this.yearPublication;
    }
    public Author getAuthor(){
        return author;
    }
    public void setYearPublication(int i){
    }


}
