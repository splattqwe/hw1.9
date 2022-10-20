import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private Integer publicationYear;


    public Book(String name, Author author, Integer publicationYear) {
        if(author==null){
            throw new RuntimeException("Author cannot be null");
        }

        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPublicationYear(), book.getPublicationYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getPublicationYear());
    }
}
