package librarysystem;

public class Loan {

    private Member member;
    private Book book;
    private String borrowDate;
    private String dueDate;

    public Loan(Member member, Book book,
                String borrowDate, String dueDate) {

        this.member = member;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Loan -> " +
                member.getName() +
                " borrowed " +
                book.getTitle() +
                " on " + borrowDate +
                ", Due: " + dueDate;
    }
}
