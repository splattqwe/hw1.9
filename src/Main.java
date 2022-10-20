public class Main {

    public static void main(String[] args) {
        var author1 = new Author("Alex1", "Chu1");
        var author2 = new Author("Alex1", "Chu1");
        var author3 = new Author("Alex3", "Chu3");

        Book book1 = new Book("book1", author1, 1991);
        var book2 = new Book("book2", author2, 1992);
        var book3 = new Book("book3", author3, 1993);


        System.out.println(author1.hashCode());
        System.out.println(book1.equals(book2));
        System.out.println(book3.toString());

     }


}


