public class Book {
    private String nameBook;
    private Author author;
    private int yearPublication;

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
