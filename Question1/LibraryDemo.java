package librarysystem;

public class LibraryDemo {

    public static void main(String[] args) {

        Library library = new Library();

        // 3 Books
        Book b1 = new Book(
                "ISBN001",
                "Java Technology",
                "Julius Mugumya");

        Book b2 = new Book(
                "ISBN002",
                "Database Systems",
                "Connolly");

        Book b3 = new Book(
                "ISBN003",
                "Computer Networks",
                "Tanenbaum");

        // 2 Members
        Member m1 = new Member(
                "M001",
                "John Waleze");

        Member m2 = new Member(
                "M002",
                "Sarah Mugozi");

        // Add books
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Register members
        library.registerMember(m1);
        library.registerMember(m2);

        System.out.println("===== BEFORE LOANS =====");

        library.displayBooks();
        library.displayMembers();

        // Successful loan
        library.lendBook(
                b1,
                m1,
                "17/06/2026",
                "24/06/2026");

        // Rejected loan
        library.lendBook(
                b1,
                m2,
                "17/06/2026",
                "24/06/2026");

        // Return book
        library.returnBook(b1, m1);

        // Another successful loan
        library.lendBook(
                b1,
                m2,
                "17/06/2026",
                "24/06/2026");

        System.out.println("\n===== AFTER LOANS =====");

        library.displayBooks();
        library.displayMembers();

        System.out.println("\nSEARCH RESULT");

        Book found =
                library.searchBookByTitle(
                        "Java Technology");

        if (found != null) {
            System.out.println(found);
        }
    }
}
