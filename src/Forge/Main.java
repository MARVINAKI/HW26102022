package Forge;

public class Main {
    public static void main(String[] args) {

        Author authorFirst, authorSecond, authorThird;
        authorFirst = new Author("Михаил", "Булгаков");
        authorSecond = new Author("Анджей", "Сапковский");
        authorThird = new Author("Уильям", "Шекспир");

        Book bookFirst, bookSecond, bookThird;
        bookFirst = new Book("Мастер и Маргарита", authorFirst, 32); // Дата публикации 1967
        bookSecond = new Book("Ведьмак", authorSecond, 12312); // Дата публикации 1986
        bookThird = new Book("Сон в летнюю ночь", authorThird, 7684); // Дата написания 1595


        bookFirst.setDateOfPublication(1967);
        bookSecond.setDateOfPublication(1986);
        bookThird.setDateOfPublication(1595);

        System.out.println(bookFirst.getFullInfoOfBook() + "\n");
        System.out.println(bookSecond.getFullInfoOfBook() + "\n");
        System.out.println(bookThird.getFullInfoOfBook() + "\n");


    }
}