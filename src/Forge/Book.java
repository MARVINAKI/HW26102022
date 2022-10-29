package Forge;

import java.time.LocalDate;

public class Book {
    private final String titleOfBook;
    private final Author authorOfBook;
    private int dateOfPublication;

    public Book(String titleOfBook, Author authorOfBook, int dateOfPublication) {
        this.titleOfBook = titleOfBook.trim();
        this.authorOfBook = authorOfBook;
        this.dateOfPublication = dateOfPublication;
    }

    public String getTitleOfBook() {
        if (titleOfBook.trim().isEmpty()) {
            return "Имя книги не указано";
        } else {
            return this.titleOfBook;
        }
    }

    public String getAuthorOfBook() {
        return authorOfBook.getFullNameOfAuthor();
    }

    public int getDateOfPublication() {
        return this.dateOfPublication;
    }

    public String getFullInfoOfBook() {
        return titleOfBook.trim().isEmpty() ? authorOfBook.getFullNameOfAuthor() + "\n" + dateOfPublication
                : titleOfBook + "\n" + authorOfBook.getFullNameOfAuthor() + "\n" + dateOfPublication;
    }

    public void setDateOfPublication(int dateOfPublication) {
        if (dateOfPublication < 0 || dateOfPublication > LocalDate.now().getYear()) {
            throw new RuntimeException("Неккоректная дата");
        }
        this.dateOfPublication = dateOfPublication;
    }

}