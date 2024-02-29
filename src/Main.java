public class Main {

    public static void main(String[] args) {
        Author lotr = new Author("Джон", " Р.Р.Толкин");
        Author rpo = new Author("Эрнест", " Клайн");
        Book bookLotr = new Book("Властелин колец", lotr,1954);
        Book bookRpo = new Book("Первому игроку приготовиться", rpo, 2011);
        System.out.println("Название книги: " + bookLotr.getNameBook() +  " Автор: "
                + lotr.getName() + lotr.getFamiliya() + " Год публикации:  " + bookLotr.getYearPublication());

        System.out.println("Название книги: " + bookRpo.getNameBook() + " Автор: "
                + rpo.getName() + rpo.getFamiliya() + " Год публикации:  " + bookRpo.getYearPublication());

    }
}