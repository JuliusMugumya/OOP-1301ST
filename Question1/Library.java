package librarysystem;

import java.util.ArrayList;

public class Library {

    private  ArrayList<Book> books;
    private  ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void lendBook(Book book, Member member,
                         String borrowDate, String dueDate) {

        if (!book.isAvailable()) {
            System.out.println(
                    "Loan Rejected: "
                    + book.getTitle()
                    + " is already on loan.");
            return;
        }

        Loan loan = new Loan(member, book,
                borrowDate, dueDate);

        member.addLoan(loan);

        book.setAvailable(false);

        System.out.println(
                "Book issued successfully to "
                + member.getName());
    }

    public void returnBook(Book book, Member member) {

        Loan foundLoan = null;

        for (Loan loan : member.getLoans()) {

            if (loan.getBook().equals(book)) {
                foundLoan = loan;
                break;
            }
        }

        if (foundLoan != null) {

            member.removeLoan(foundLoan);

            book.setAvailable(true);

            System.out.println(
                    "Book returned successfully.");
        }
    }

    public Book searchBookByTitle(String title) {

        for (Book book : books) {

            if (book.getTitle()
                    .equalsIgnoreCase(title)) {

                return book;
            }
        }

        return null;
    }

    public void displayBooks() {

        System.out.println("\nLIBRARY BOOKS");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayMembers() {

        System.out.println("\nMEMBERS");

        for (Member member : members) {
            System.out.println(member);
        }
    }
}
