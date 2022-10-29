package Forge;

import java.time.LocalDate;
import java.util.Objects;

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


    @Override
    public String toString() {
        return "Книга " + titleOfBook + " под авторством " + authorOfBook +
                " издана " + dateOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return titleOfBook.equals(book.titleOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfBook);
    }
}