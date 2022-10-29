package Forge;


public class Author {
    private final String nameOfAuthor;
    private final String surnameOfAuthor;

    public Author(String nameOfAuthor, String surnameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor.trim();
        this.surnameOfAuthor = surnameOfAuthor.trim();
    }

    public String getNameOfAuthor() {
        if (nameOfAuthor.trim().isEmpty()) {
            return "Имя автора не указано";
        } else {
            return this.nameOfAuthor;
        }
    }

    public String getSurnameOfAuthor() {
        if (surnameOfAuthor.trim().isEmpty()) {
            return "Фамилия автора не указана";
        } else {
            return this.surnameOfAuthor;
        }
    }

    public String getFullNameOfAuthor() {
        return nameOfAuthor.trim().isEmpty() && surnameOfAuthor.trim().isEmpty() ? "Автор не указан"
                : nameOfAuthor.trim().isEmpty() ? this.surnameOfAuthor
                : surnameOfAuthor.trim().isEmpty() ? this.nameOfAuthor
                : this.nameOfAuthor + " " + this.surnameOfAuthor;
    }
}