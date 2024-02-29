public class Main {

    public static void main(String[] args) {
        Author lotr = new Author("Джон", " Р.Р.Толкин");
        Book bookLotr = new Book("Властелин колец", lotr, 1954);
        bookLotr.setYearPublication(1956);
        System.out.println("Название книги: " + bookLotr.getNameBook() + " Автор: "
                + lotr.getName() + lotr.getFamiliya() + " Год публикации:  " + bookLotr.getYearPublication());

        Author rpo = new Author("Эрнест", " Клайн");
        Book bookRpo = new Book("Первому игроку приготовиться", rpo, 2011);
        bookRpo.setYearPublication(2011);
        System.out.println("Название книги: " + bookRpo.getNameBook() + " Автор: "
                + rpo.getName() + rpo.getFamiliya() + " Год публикации:  " + bookRpo.getYearPublication());

    }
}