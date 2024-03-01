public class Main {

    public static void main(String[] args) {
        Author lotr = new Author("Джон", " Р.Р.Толкин");
        Book bookLotr = new Book("Властелин колец", lotr, 1954);
        bookLotr.setYearPublication(1956);
        System.out.println("Название книги: " + bookLotr.getNameBook() + " Автор: "
                + bookLotr.getAuthor().getName() + bookLotr.getAuthor().getFamiliya() + " Год публикации:  " + bookLotr.getYearPublication());

        Author rpo = new Author("Эрнест", " Клайн");
        Book bookRpo = new Book("Первому игроку приготовиться", rpo, 2011);
        bookRpo.setYearPublication(2011);
        System.out.println("Название книги: " + bookRpo.getNameBook() + " Автор: "
                + bookRpo.getAuthor().getName() + bookRpo.getAuthor().getFamiliya() + " Год публикации:  " + bookRpo.getYearPublication());

    }
}