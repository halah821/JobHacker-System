import java.util.UUID;

public class CheckoutBook {

    String borrowerId;
    String borrowedBookId;
    String checkoutId;
    Boolean returned =true;

    public CheckoutBook(User borrower, Book borrowedBook) {
        getCheckoutInstance(borrower,borrowedBook);
    }

    public CheckoutBook getCheckoutInstance(User borrower, Book borrowedBook){
        this.borrowerId = borrower.getUserID();
        this.borrowedBookId = borrowedBook.getId();
        borrowedBook.setAvailable(false);
        this.returned = false;
        if (checkoutId==null){
            setCheckoutId();
        }
        return this;
    }

    public Boolean isReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    public void setCheckoutId() {
        this.checkoutId = UUID.randomUUID().toString();
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public void setBorrowedBookId(String borrowedBookId) {
        this.borrowedBookId = borrowedBookId;
    }

    public String getCheckoutId() {
        return checkoutId;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public String getBorrowedBookId() {
        return borrowedBookId;
    }

    public void returnBook(Book borrowedBook){
        borrowedBook.setAvailable(true);
        this.setReturned(true);
    }

}
