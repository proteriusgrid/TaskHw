package TaskHWL9;

public class Main {
    public static void main( String[] args ) {

        Reader reader1 = new Reader("Petrov V.V.", 1, "IT", "29.11.2004", "+123451234");
        Reader reader2 = new Reader("Morozov M.M.", 2, "IT", "06.12.1995", "+123451311");
        Reader reader3 = new Reader("Fedorov F.F.", 3, "IT", "07.05.2010","+123451567");

        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Foundation ", "Isaac Asimov");
        Book book2 = new Book("Dune ", "Frank Herbert");
        Book book3 = new Book("The Martian", "Andy Weir");
        Book[] books = {book1, book2, book3};

        printReaders(readers);

        printBooks(books);

        reader1.takeBook(6);
        reader2.takeBook("Nineteen Eighty-Four , Orwell", "Grock algorithms, Bhargava ");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook(2);
        reader2.returnBook("Grock algorithms, Bhargava ");
        reader3.returnBook(book3);

    }
    private static void printBooks( Book[] books) {

        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders( Reader[] readers) {

        System.out.println("Readers list:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}
