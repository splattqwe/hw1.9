public class Book {
    private final String name;
    private final Author author;
    private Integer publicationYear;

    public Book(String name, Author author, Integer publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }


    public Integer getPublicationYear(int i) {
        return publicationYear;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = 2020;
        System.out.println();
    }


}
